package com.jsb.rest.client;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.cxf.jaxrs.client.WebClient;

import com.jsb.rest.comm.JSBRestException;
import com.jsb.rest.comm.JSBUtils;
import com.jsb.rest.comm.JSONHelper;
import com.jsb.rest.comm.auth.JSBAuthInfo;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSBClient
{
    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(JSBClient.class);


    private WebClient client = null;

    private String accessKey;

    private String secretKey;

    private static String JSBServer = "http://120.55.246.87/JSB/rest/";

    private JsonConfig jsConfig;

    public static void setServerUrl(String url)
    {
        JSBServer = url;

    }

    /**
     * 构造方法
     *
     * @param ak
     * @param sk
     */
    public JSBClient(String ak, String sk)
    {
        this.setAccessKey(ak);
        this.setSecretKey(sk);
        client = WebClient.create(JSBServer);
        jsConfig = new JsonConfig();
        jsConfig.setExcludes(new String[] {"success"});
    }

    /**
     * <p>
     * 构造格式化之后的请求字符串
     * <p>
     * PUT
     * <p>
     * http%3a%2f%2flocalhost%3a9905%2fjsbrestful%2frest%2ftaobao
     * <p>
     * accept:application/xml
     * <p>
     * x-jsb-sdk-req-timestamp:20160606172625+0000
     * <p>
     * x-jsb-sdk-req-uuid:fc507c46-376b-4ac5-922b-003ceac06006
     *
     * @param method
     * @param auth
     * @throws UnsupportedEncodingException
     */
    private void fillAuthBaseInfo(String method, JSBAuthInfo auth)
            throws UnsupportedEncodingException
    {
        StringBuffer canonReqBuffer = new StringBuffer();

        URI reqUri = client.getCurrentURI();
        canonReqBuffer.append(method.trim().toUpperCase());
        canonReqBuffer.append("\n");
        String origUri = URLDecoder.decode(reqUri.toString(), "UTF-8");
        canonReqBuffer.append(URLEncoder.encode(origUri, "UTF-8").toLowerCase());
        canonReqBuffer.append("\n");
        MultivaluedMap<String, String> headers = client.getHeaders();
        Object[] keys = headers.keySet().toArray();
        Arrays.sort(keys);

        StringBuffer signedHeader = new StringBuffer();
        for (int i = 0; i < keys.length; i++)
        {
            String headerKey = URLEncoder.encode((String)keys[i], "UTF-8");
            canonReqBuffer.append(headerKey.toLowerCase());
            canonReqBuffer.append(":");
            canonReqBuffer.append(headers.getFirst((String)keys[i]).trim().toLowerCase());
            canonReqBuffer.append("\n");
            if (i > 0)
                signedHeader.append(";");
            signedHeader.append(headerKey);
        }
        auth.setCanonRequest(canonReqBuffer.toString());
        auth.setSignedHeader(signedHeader.toString());
    }

    /**
     * 生成鉴权信息
     *
     * @param method
     * @param requestId
     * @return
     * @throws Exception
     */
    private JSBAuthInfo generateAuthInfo(String method, String requestId)
            throws Exception
    {
        JSBAuthInfo info = new JSBAuthInfo();
        fillAuthBaseInfo(method, info);
        info.setAccessKey(this.accessKey);
        info.setSignature(JSBUtils.getSignatureKey(this.secretKey, requestId, info.getCanonRequest()));
        return info;
    }

    public <T extends TaobaoResponse> T executeJsbReq(JSBRequest<T> jsbReq)
            throws JSBRestException
    {
        String requestId = UUID.randomUUID().toString();

        client.header("x-jsb-sdk-req-uuid", requestId);
        client.header("x-jsb-sdk-req-timestamp", JSBUtils.getGmtTimeStr());
        client.path("/" + jsbReq.getResourceUrl());
        client.resetQuery();
        client.replaceQuery(jsbReq.getQueryStr());
        try
        {
            jsbReq.checkParameter();
            JSBAuthInfo auth = generateAuthInfo(jsbReq.getMethod().toString(), requestId);
            client.header("Authorization", auth.getAuthorizationContent()); // 设置鉴权信息头部
            if (null != jsbReq.getType())
            {
                client.type(jsbReq.getType());
            }
            Response respa = null;
            switch (jsbReq.getMethod())
            {
                case JSB_METHOD_PUT:
                    respa = client.put(jsbReq.getEntity());
                    break;
                case JSB_METHOD_POST:
                    break;
                case JSB_METHOD_GET:
                    respa = client.get();
                    break;
                default:
                    throw new JSBRestException("invalid method");
            }
            String resp = respa.readEntity(String.class);
            System.out.println(resp);
            TaobaoParser<T> parser = new ObjectJsonParser<T>(jsbReq.getResponseClass(), false);
            T respObj = parser.parse(resp);
            respObj.setBody(resp);
            client.close();
            jsbReq.postHandler();
            return respObj;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            T localResponse = null;
            try
            {
                localResponse = jsbReq.getResponseClass().newInstance();
            }
            catch (Exception xe)
            {
                throw new JSBRestException(xe);
            }
            localResponse.setErrorCode("Client-side-err");
            localResponse.setMsg(e.getMessage());
            return localResponse;
        }
    }

    public String testSign(String key)
            throws Exception
    {
        this.setSecretKey(key);
        String requestId = UUID.randomUUID().toString();
        client.header("x-jsb-sdk-req-uuid", requestId);
        client.header("x-jsb-sdk-req-timestamp", JSBUtils.getGmtTimeStr());
        // 设置资源路径
        client.path("/sign_test");
        JSBAuthInfo auth = generateAuthInfo(JSBHttpMethod.JSB_METHOD_PUT.toString(), requestId);
        client.header("Authorization", auth.getAuthorizationContent()); // 设置鉴权信息头部
        Response respa = client.put(null);
        client.close();
        return respa.readEntity(String.class);
    }

    /**
     * 执行请求: 旧版本的执行方法，服务端返回的是整个Response
     *
     * @param req
     * @return
     * @throws Exception
     */
    public <T extends TaobaoResponse> T execute_old(TaobaoRequest<T> req, boolean v1)
            throws JSBRestException
    {
        try
        {
            logger.debug("execute taobao request:" + req.getApiMethodName());

            // 参数检查
            req.check();

            // 设置基本的头域
            String requestId = UUID.randomUUID().toString();
            client.header("x-jsb-sdk-req-uuid", requestId);
            client.header("x-jsb-sdk-req-timestamp", JSBUtils.getGmtTimeStr());

            // 设置资源路径
            client.path("/top");

            // 计算签名
            JSBAuthInfo auth;
            auth = generateAuthInfo(JSBHttpMethod.JSB_METHOD_PUT.toString(), requestId);
            client.header("Authorization", auth.getAuthorizationContent()); // 设置鉴权信息头部

            // 执行请求
            String resp = null;
            Response respa = client.put(JSONObject.fromObject(req, JSONHelper.dateFormaterConfig).toString());
            resp = respa.readEntity(String.class);
            logger.debug(req.getResponseClass().getCanonicalName() + " response:" + resp);
            JSONObject jo = JSONObject.fromObject(resp, jsConfig);
            Map<String, Class<?>> respClassMap = JSONHelper.getMap(req.getResponseClass().getCanonicalName());
            @SuppressWarnings("unchecked")
            T lcgResp = (T)JSONObject.toBean(jo, req.getResponseClass(), respClassMap);
            TaobaoBeanUtils.fixSuccessFiled(lcgResp);
            client.close();
            return lcgResp;
        }
        catch (ApiRuleException e)
        {
            T localResponse = null;
            try
            {
                localResponse = req.getResponseClass().newInstance();
            }
            catch (Exception xe)
            {
                throw new JSBRestException(xe);
            }
            localResponse.setErrorCode(e.getErrCode());
            localResponse.setMsg(e.getErrMsg());
            return localResponse;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new JSBRestException("execute request error");
        }
    }

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> req)
            throws JSBRestException
    {
        return execute(req, "/top/v1");
    }

    /**
     * 执行请求
     *
     * @param req
     * @return
     * @throws Exception
     */
    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> req, String path)
            throws JSBRestException
    {
        try
        {
            logger.debug("execute taobao request:" + req.getApiMethodName());

            // 参数检查
            req.check();

            // 设置基本的头域
            String requestId = UUID.randomUUID().toString();
            client.header("x-jsb-sdk-req-uuid", requestId);
            client.header("x-jsb-sdk-req-timestamp", JSBUtils.getGmtTimeStr());
            // 设置资源路径
            client.path(path);

            // 计算签名
            JSBAuthInfo auth;
            auth = generateAuthInfo(JSBHttpMethod.JSB_METHOD_PUT.toString(), requestId);
            client.header("Authorization", auth.getAuthorizationContent()); // 设置鉴权信息头部

            // 执行请求
            String resp = null;
            String reqString = JSONObject.fromObject(req, JSONHelper.dateFormaterConfig).toString();
            System.out.println(reqString);
            Response respa = client.put(reqString);
            resp = respa.readEntity(String.class);
            logger.debug(req.getResponseClass().getCanonicalName() + " response:" + resp);
            TaobaoParser<T> parser = new ObjectJsonParser<>(req.getResponseClass(), false);
            T respObj = parser.parse(resp);
            respObj.setBody(resp);
            client.close();
            return respObj;
        }
        catch (Exception e)
        {
            T localResponse = null;
            try
            {
                localResponse = req.getResponseClass().newInstance();
            }
            catch (Exception xe)
            {
                throw new JSBRestException(xe);
            }
            localResponse.setErrorCode("Client-side-err");
            localResponse.setMsg(e.getMessage());
            return localResponse;
        }
    }

    public String getAccessKey()
    {
        return accessKey;
    }

    public void setAccessKey(String accessKey)
    {
        this.accessKey = accessKey;
    }

    public String getSecretKey()
    {
        return secretKey;
    }

    public void setSecretKey(String secretKey)
    {
        this.secretKey = secretKey;
    }
}
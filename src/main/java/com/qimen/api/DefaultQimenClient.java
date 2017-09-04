package com.qimen.api;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.parser.xml.QimenXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.WebUtils;
import com.taobao.api.internal.util.XmlWriter;

import java.io.IOException;
import java.util.Date;

public class DefaultQimenClient
        implements QimenClient {
    protected String serverUrl;
    protected String appKey;
    protected String appSecret;
    protected String format = "xml";
    protected String signMethod = "md5";
    protected int connectTimeout = 15000;
    protected int readTimeout = 30000;
    protected boolean needEnableParser = true;
    protected boolean useGzipEncoding = true;

    public DefaultQimenClient(String serverUrl, String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.serverUrl = serverUrl;
    }

    public <T extends QimenResponse> T execute(QimenRequest<T> request) throws ApiException {
        return execute(request, null);
    }

    public <T extends QimenResponse> T execute(QimenRequest<T> request, String session) throws ApiException {
        return _execute(request, session);
    }

    private <T extends QimenResponse> T _execute(QimenRequest<T> request, String session) throws ApiException {
        long start = System.currentTimeMillis();

        RequestParametersHolder requestHolder = new RequestParametersHolder();
        requestHolder.setApplicationParams(request.getQueryParams());

        TaobaoHashMap protocalMustParams = new TaobaoHashMap();
        protocalMustParams.put("method", request.getApiMethodName());
        protocalMustParams.put("v", request.getVersion());
        protocalMustParams.put("app_key", this.appKey);
        Long timestamp = request.getTimestamp();
        if (timestamp == null) {
            timestamp = Long.valueOf(System.currentTimeMillis());
        }

        protocalMustParams.put("timestamp", new Date(timestamp.longValue()));
        requestHolder.setProtocalMustParams(protocalMustParams);

        TaobaoHashMap protocalOptParams = new TaobaoHashMap();
        protocalOptParams.put("format", this.format);
        protocalOptParams.put("sign_method", this.signMethod);
        protocalOptParams.put("session", session);
        protocalOptParams.put("partner_id", "top-sdk-java-20160611");
        protocalOptParams.put("customerId", request.getCustomerId());
        requestHolder.setProtocalOptParams(protocalOptParams);
        try {
            String apiBody = request.getBody();
            if (StringUtils.isEmpty(apiBody)) {
                XmlWriter writer = new XmlWriter(true, "request", QimenRequest.class);
                apiBody = writer.write(request);
            }

            protocalMustParams.put("sign", TaobaoUtils.signTopRequestWithBody(requestHolder, apiBody, this.appSecret, this.signMethod));

            String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), "UTF-8");
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), "UTF-8");
            String fullUrl = WebUtils.buildRequestUrl(this.serverUrl, new String[]{sysMustQuery, sysOptQuery});

            TaobaoHashMap headerMap = null;

            if (this.useGzipEncoding) {
                headerMap = new TaobaoHashMap();
                headerMap.put("Accept-Encoding", "gzip");
            }

            String rsp = WebUtils.doPost(fullUrl, "text/xml;charset=utf-8", apiBody.getBytes("UTF-8"), this.connectTimeout, this.readTimeout, headerMap);
            requestHolder.setResponseBody(rsp);
        } catch (IOException e) {
            TaobaoLogger.logApiError(this.appKey, request.getApiMethodName(), this.serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
            throw new ApiException(e);
        }

        TaobaoParser<T> parser = null;
        if ((this.needEnableParser) &&
                ("xml".equals(this.format))) {
            parser = new QimenXmlParser(request.getResponseClass());
        }

        T tRsp = null;
        if (this.needEnableParser) {
            tRsp = parser.parse(requestHolder.getResponseBody());
            tRsp.setBody(requestHolder.getResponseBody());
        } else {
            try {
                tRsp = request.getResponseClass().newInstance();
                tRsp.setBody(requestHolder.getResponseBody());
            } catch (Exception e) {
                throw new ApiException(e);
            }
        }

        if (!tRsp.isSuccess()) {
            TaobaoLogger.logApiError(this.appKey, request.getApiMethodName(), this.serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
        }
        return tRsp;
    }

    public void setNeedEnableParser(boolean needEnableParser) {
        this.needEnableParser = needEnableParser;
    }

    public void setNeedEnableLogger(boolean needEnableLogger) {
        TaobaoLogger.setNeedEnableLogger(needEnableLogger);
    }

    public void setIgnoreSSLCheck(boolean ignore) {
        WebUtils.setIgnoreSSLCheck(ignore);
    }

    public void setUseGzipEncoding(boolean useGzipEncoding) {
        this.useGzipEncoding = useGzipEncoding;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }
}



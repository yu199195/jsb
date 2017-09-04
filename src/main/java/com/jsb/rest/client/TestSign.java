package com.jsb.rest.client;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.request.TradesSoldIncrementGetRequest;
import net.sf.json.JSONObject;

public class TestSign {
    private static final String testJsonStr = "{\"apiMethodName\":\"taobao.trades.sold.increment.get\",\"batchApiOrder\":0,\"batchApiSession\":\"\",\"buyerNick\":\"\",\"endModified\":\"2016-06-20 23:59:59\",\"extType\":\"\",\"fields\":\"tid,type,status,payment,orders,rx_audit_status\",\"headerMap\":{},\"pageNo\":1,\"pageSize\":40,\"rateStatus\":\"\",\"responseClass\":\"com.taobao.api.response.TradesSoldIncrementGetResponse\",\"startModified\":\"2016-06-20 11:11:11\",\"status\":\"WAIT_BUYER_CONFIRM_GOODS\",\"tag\":\"\",\"targetAppKey\":\"\",\"textParams\":{\"start_modified\":\"2016-06-20 11:11:11\",\"page_no\":\"1\",\"fields\":\"tid,type,status,payment,orders,rx_audit_status\",\"end_modified\":\"2016-06-20 23:59:59\",\"use_has_next\":\"true\",\"page_size\":\"40\",\"status\":\"WAIT_BUYER_CONFIRM_GOODS\"},\"timestamp\":null,\"topMixParams\":\"\",\"type\":\"\",\"useHasNext\":true}";

    private Class<?> getReqClass(String method)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String[] segment = method.split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append("com.taobao.api.request.");
        for (int idx = method.startsWith("taobao") ? 1 : 0;
             idx < segment.length; idx++) {
            // sb.append(JSBAuthUtils.captureName(segment[idx]));
        }
        sb.append("Request");
        String clazzName = sb.toString();
        return Class.forName(clazzName).newInstance().getClass();
    }

    public void getReq() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        JSONObject reqJsonObj = JSONObject.fromObject("{\"apiMethodName\":\"taobao.trades.sold.increment.get\",\"batchApiOrder\":0,\"batchApiSession\":\"\",\"buyerNick\":\"\",\"endModified\":\"2016-06-20 23:59:59\",\"extType\":\"\",\"fields\":\"tid,type,status,payment,orders,rx_audit_status\",\"headerMap\":{},\"pageNo\":1,\"pageSize\":40,\"rateStatus\":\"\",\"responseClass\":\"com.taobao.api.response.TradesSoldIncrementGetResponse\",\"startModified\":\"2016-06-20 11:11:11\",\"status\":\"WAIT_BUYER_CONFIRM_GOODS\",\"tag\":\"\",\"targetAppKey\":\"\",\"textParams\":{\"start_modified\":\"2016-06-20 11:11:11\",\"page_no\":\"1\",\"fields\":\"tid,type,status,payment,orders,rx_audit_status\",\"end_modified\":\"2016-06-20 23:59:59\",\"use_has_next\":\"true\",\"page_size\":\"40\",\"status\":\"WAIT_BUYER_CONFIRM_GOODS\"},\"timestamp\":null,\"topMixParams\":\"\",\"type\":\"\",\"useHasNext\":true}", null);
        String apiMethodName = reqJsonObj.getString("apiMethodName");
        reqJsonObj.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        reqJsonObj.remove("apiMethodName");
        reqJsonObj.remove("responseClass");
        reqJsonObj.remove("textParams");
        System.out.println(new StringBuilder().append("Request JsonString: ").append(reqJsonObj).toString());

        Class<?> reqClazz = getReqClass(apiMethodName);

        TaobaoRequest<? extends TaobaoResponse> taobaoReq = (TaobaoRequest) JSONObject.toBean(reqJsonObj, reqClazz);
        System.out.println(taobaoReq.getTextParams());

        TradesSoldIncrementGetRequest tsigReq = (TradesSoldIncrementGetRequest) taobaoReq;
        System.out.println(tsigReq.getTextParams().toString());
        System.out.println(tsigReq.getStartModified());
        System.out.println(tsigReq.getEndModified());
    }

    public static void main(String[] args) {
        TestSign instance = new TestSign();
        try {
            instance.getReq();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}



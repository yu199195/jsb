package com.taobao.api.internal.util;

import java.util.HashMap;
import java.util.Map;

public class TaobaoContext {
    public static final String APPKEY = "top_appkey";
    public static final String SESSION = "top_session";
    public static final String SIGNATURE = "top_sign";
    public static final String PARAMETERS = "top_parameters";
    public static final String USER_ID = "visitor_id";
    public static final String USER_NICK = "visitor_nick";
    private Map<String, String> parameters = new HashMap();

    private String callbackUrl;

    public String getAppKey() {
        return getParameter("top_appkey");
    }

    public String getSessionKey() {
        return getParameter("top_session");
    }

    public String getSignature() {
        return getParameter("top_sign");
    }

    public Long getUserId() {
        String userId = getParameter("visitor_id");
        if (StringUtils.isEmpty(userId)) {
            return null;
        }
        return Long.valueOf(userId);
    }

    public String getUserNick() {
        return getParameter("visitor_nick");
    }

    public String getParameter(String key) {
        return (String) this.parameters.get(key);
    }

    public void addParameters(Map<String, String> parameters) {
        if ((parameters != null) && (!parameters.isEmpty())) {
            this.parameters.putAll(parameters);
        }
    }

    public void addParameter(String key, String value) {
        this.parameters.put(key, value);
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
}



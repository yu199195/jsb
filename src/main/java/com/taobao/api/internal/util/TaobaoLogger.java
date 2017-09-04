package com.taobao.api.internal.util;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TaobaoLogger {
    private static final Log log = LogFactory.getLog("topsdk");

    private static final String LOG_SPLIT = "^_^";
    private static String osName = System.getProperties().getProperty("os.name");
    private static boolean needEnableLogger = true;

    public static void setNeedEnableLogger(boolean needEnableLogger) {
        needEnableLogger = needEnableLogger;
    }

    public static void logApiError(String appKey, String apiName, String url, Map<String, String> params, long latency, String errorMessage) {
        if (!needEnableLogger) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(formatDateTime(new Date()));
        sb.append("^_^");
        sb.append(appKey);
        sb.append("^_^");
        sb.append(apiName);
        sb.append("^_^");
        sb.append(TaobaoUtils.getIntranetIp());
        sb.append("^_^");
        sb.append(osName);
        sb.append("^_^");
        sb.append(latency);
        sb.append("^_^");
        sb.append(url);
        try {
            sb.append("^_^");
            sb.append(WebUtils.buildQuery(params, "utf-8"));
        } catch (IOException e) {
        }
        sb.append("^_^");
        sb.append(errorMessage);
        log.error(sb.toString());
    }

    private static String formatDateTime(Date date) {
        return StringUtils.formatDateTime(date, "yyyy-MM-dd HH:mm:ss.SSS");
    }
}



package com.taobao.api.internal.util;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

import java.util.List;

public class RequestCheckUtils {
    public static final String ERROR_CODE_ARGUMENTS_MISSING = "40";
    public static final String ERROR_CODE_ARGUMENTS_INVALID = "41";

    public static void checkNotEmpty(Object value, String fieldName)
            throws ApiRuleException {
        if (value == null) {
            throw new ApiRuleException("40", "client-error:Missing required arguments:" + fieldName + "");
        }

        if ((value instanceof String)) {
            if (((String) value).trim().length() == 0) {
                throw new ApiRuleException("40", "client-error:Missing required arguments:" + fieldName + "");
            }
        }
    }

    public static void checkNumeric(String value, String fieldName)
            throws ApiRuleException {
        checkNotEmpty(value, fieldName);
        if (!StringUtils.isNumeric(value)) {
            throw new ApiRuleException("41", "client-error:Invalid arguments:the fileld " + fieldName + " should be a numeric.");
        }
    }

    public static void checkMaxLength(String value, int maxLength, String fieldName)
            throws ApiRuleException {
        if (value != null) {
            if (value.length() > maxLength) {
                throw new ApiRuleException("41", "client-error:Invalid arguments:the string length of " + fieldName + " can not be larger than " + maxLength + ".");
            }
        }
    }

    public static void checkMaxLength(FileItem fileItem, int maxLength, String fieldName)
            throws ApiRuleException {
        if ((fileItem != null) && (fileItem.getFileLength() > maxLength)) {
            throw new ApiRuleException("41", "client-error:Invalid arguments:the file size of " + fieldName + " can not be larger than " + maxLength + ".");
        }
    }

    public static void checkMaxListSize(String value, int maxSize, String fieldName)
            throws ApiRuleException {
        if (value != null) {
            String[] list = value.split(",");
            if ((list != null) && (list.length > maxSize)) {
                throw new ApiRuleException("41", "client-error:Invalid arguments:the array size of " + fieldName + " must be less than " + maxSize + ".");
            }
        }
    }

    public static void checkObjectMaxListSize(String value, int maxSize, String fieldName)
            throws ApiRuleException {
        if (value != null) {
            JSONReader reader = new JSONValidatingReader();
            Object obj = reader.read(value);
            if (((obj instanceof List)) && (((List) obj).size() > maxSize)) {
                throw new ApiRuleException("41", "client-error:Invalid arguments:the array size of " + fieldName + " must be less than " + maxSize + ".");
            }
        }
    }

    public static void checkMaxValue(Long value, long maxValue, String fieldName)
            throws ApiRuleException {
        if (value != null) {
            if (value.longValue() > maxValue) {
                throw new ApiRuleException("41", "client-error:Invalid arguments:the value of " + fieldName + " can not be larger than " + maxValue + ".");
            }
        }
    }

    public static void checkMinValue(Long value, long minValue, String fieldName)
            throws ApiRuleException {
        if (value != null) {
            if (value.longValue() < minValue) {
                throw new ApiRuleException("41", "client-error:Invalid arguments:the value of " + fieldName + " can not be less than " + minValue + ".");
            }
        }
    }
}



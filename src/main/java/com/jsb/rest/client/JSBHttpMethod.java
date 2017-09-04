package com.jsb.rest.client;

public enum JSBHttpMethod {
    JSB_METHOD_POST("post"), JSB_METHOD_GET("get"), JSB_METHOD_PUT("put"), JSB_METHOD_DELETE("delete");

    private String name;

    private JSBHttpMethod(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}



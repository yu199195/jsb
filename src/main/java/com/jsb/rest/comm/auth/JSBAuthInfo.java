package com.jsb.rest.comm.auth;

public class JSBAuthInfo {
    private String canonRequest;

    private String signedHeader;

    private String accessKey;

    private String signature;

    public String getCanonRequest() {
        return this.canonRequest;
    }

    public void setCanonRequest(String canonRequest) {
        this.canonRequest = canonRequest;
    }

    public String getSignedHeader() {
        return this.signedHeader;
    }

    public void setSignedHeader(String signedHeader) {
        this.signedHeader = signedHeader;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAuthorizationContent() {
        StringBuffer sb = new StringBuffer();
        sb.append("Credential=" + this.accessKey + ",");
        sb.append("SignedHeaders=" + this.signedHeader + ",");
        sb.append("Signature=" + this.signature);
        return sb.toString();
    }
}



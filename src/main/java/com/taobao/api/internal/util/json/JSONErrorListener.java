package com.taobao.api.internal.util.json;

public abstract interface JSONErrorListener {
    public abstract void start(String paramString);

    public abstract void error(String paramString, int paramInt);

    public abstract void end();
}



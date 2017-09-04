package com.taobao.api;

import java.util.Map;

public abstract interface TaobaoUploadRequest<T extends TaobaoResponse>
        extends TaobaoRequest<T> {
    public abstract Map<String, FileItem> getFileParams();
}



package com.taobao.api.internal.parser.json;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.Converter;

public class ObjectJsonParser<T extends TaobaoResponse>
        implements TaobaoParser<T> {
    private Class<T> clazz;
    private boolean simplify;

    public ObjectJsonParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public ObjectJsonParser(Class<T> clazz, boolean simplify) {
        this.clazz = clazz;
        this.simplify = simplify;
    }

    public T parse(String rsp) throws ApiException {
        Converter converter;
        if (this.simplify) {
            converter = new SimplifyJsonConverter();
        } else {
            converter = new JsonConverter();
        }
        return  converter.toResponse(rsp, this.clazz);
    }

    public Class<T> getResponseClass() {
        return this.clazz;
    }
}



package com.jsb.rest.client;

import com.taobao.api.TaobaoResponse;
import org.apache.cxf.common.util.StringUtils;

public class TaobaoBeanUtils {
    public static void fixSuccessFiled(TaobaoResponse resp) {
        if (StringUtils.isEmpty(resp.getErrorCode().trim())) {
            resp.setErrorCode(null);
        }
        if (StringUtils.isEmpty(resp.getSubCode().trim())) {
            resp.setSubCode(null);
        }
    }
}



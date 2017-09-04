package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationProductcatAddResponse;

import java.util.Map;

public class FenxiaoCooperationProductcatAddRequest
        extends BaseTaobaoRequest<FenxiaoCooperationProductcatAddResponse> {
    private Long cooperateId;
    private Long gradeId;
    private String productLineList;

    public void setCooperateId(Long cooperateId) {
        this.cooperateId = cooperateId;
    }

    public Long getCooperateId() {
        return this.cooperateId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public Long getGradeId() {
        return this.gradeId;
    }

    public void setProductLineList(String productLineList) {
        this.productLineList = productLineList;
    }

    public String getProductLineList() {
        return this.productLineList;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.productcat.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cooperate_id", this.cooperateId);
        txtParams.put("grade_id", this.gradeId);
        txtParams.put("product_line_list", this.productLineList);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoCooperationProductcatAddResponse> getResponseClass() {
        return FenxiaoCooperationProductcatAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.cooperateId, "cooperateId");
        RequestCheckUtils.checkNotEmpty(this.productLineList, "productLineList");
    }
}



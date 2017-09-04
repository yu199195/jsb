package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundRefuseResponse;

import java.util.HashMap;
import java.util.Map;

public class RefundRefuseRequest
        extends BaseTaobaoRequest<RefundRefuseResponse>
        implements TaobaoUploadRequest<RefundRefuseResponse> {
    private Long oid;
    private Long refundId;
    private String refundPhase;
    private Long refundVersion;
    private String refuseMessage;
    private FileItem refuseProof;
    private Long refuseReasonId;
    private Long tid;

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public void setRefuseMessage(String refuseMessage) {
        this.refuseMessage = refuseMessage;
    }

    public String getRefuseMessage() {
        return this.refuseMessage;
    }

    public void setRefuseProof(FileItem refuseProof) {
        this.refuseProof = refuseProof;
    }

    public FileItem getRefuseProof() {
        return this.refuseProof;
    }

    public void setRefuseReasonId(Long refuseReasonId) {
        this.refuseReasonId = refuseReasonId;
    }

    public Long getRefuseReasonId() {
        return this.refuseReasonId;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.refund.refuse";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
        txtParams.put("refund_version", this.refundVersion);
        txtParams.put("refuse_message", this.refuseMessage);
        txtParams.put("refuse_reason_id", this.refuseReasonId);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RefundRefuseResponse> getResponseClass() {
        return RefundRefuseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.refundId, "refundId");
        RequestCheckUtils.checkNotEmpty(this.refuseMessage, "refuseMessage");
        RequestCheckUtils.checkMaxLength(this.refuseMessage, 200, "refuseMessage");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("refuse_proof", this.refuseProof);
        return params;
    }
}



package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class AlibabaAliqinTaSmsNumQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7679219962822799373L;
    @ApiField("current_page")
    private Long currentPage;
    @ApiField("page_size")
    private Long pageSize;
    @ApiField("total_count")
    private Long totalCount;
    @ApiField("total_page")
    private Long totalPage;
    @ApiListField("values")
    @ApiField("fc_partner_sms_detail_dto")
    private List<FcPartnerSmsDetailDto> values;

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }

    public void setValues(List<FcPartnerSmsDetailDto> values) {
        this.values = values;
    }

    public List<FcPartnerSmsDetailDto> getValues() {
        return this.values;
    }

    public static class FcPartnerSmsDetailDto
            extends TaobaoObject {
        private static final long serialVersionUID = 3379416914713297624L;

        @ApiField("extend")
        private String extend;

        @ApiField("rec_num")
        private String recNum;

        @ApiField("result_code")
        private String resultCode;

        @ApiField("sms_code")
        private String smsCode;

        @ApiField("sms_content")
        private String smsContent;

        @ApiField("sms_receiver_time")
        private Date smsReceiverTime;

        @ApiField("sms_send_time")
        private Date smsSendTime;

        @ApiField("sms_status")
        private Long smsStatus;

        public String getExtend() {
            return this.extend;
        }

        public void setExtend(String extend) {
            this.extend = extend;
        }

        public String getRecNum() {
            return this.recNum;
        }

        public void setRecNum(String recNum) {
            this.recNum = recNum;
        }

        public String getResultCode() {
            return this.resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public String getSmsCode() {
            return this.smsCode;
        }

        public void setSmsCode(String smsCode) {
            this.smsCode = smsCode;
        }

        public String getSmsContent() {
            return this.smsContent;
        }

        public void setSmsContent(String smsContent) {
            this.smsContent = smsContent;
        }

        public Date getSmsReceiverTime() {
            return this.smsReceiverTime;
        }

        public void setSmsReceiverTime(Date smsReceiverTime) {
            this.smsReceiverTime = smsReceiverTime;
        }

        public Date getSmsSendTime() {
            return this.smsSendTime;
        }

        public void setSmsSendTime(Date smsSendTime) {
            this.smsSendTime = smsSendTime;
        }

        public Long getSmsStatus() {
            return this.smsStatus;
        }

        public void setSmsStatus(Long smsStatus) {
            this.smsStatus = smsStatus;
        }
    }
}



package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsSnInfoQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6624273568881821348L;
    @ApiField("result")
    private Result result;

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public static class Sninfo
            extends TaobaoObject {
        private static final long serialVersionUID = 7563432352543697792L;

        @ApiField("inventory_type")
        private Long inventoryType;

        @ApiField("item_code")
        private String itemCode;

        @ApiField("item_id")
        private String itemId;

        @ApiField("sn_code")
        private String snCode;

        public Long getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(Long inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getItemCode() {
            return this.itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getSnCode() {
            return this.snCode;
        }

        public void setSnCode(String snCode) {
            this.snCode = snCode;
        }
    }

    public static class Sninfolist
            extends TaobaoObject {
        private static final long serialVersionUID = 1499424848612418267L;

        @ApiField("sn_info")
        private Sninfo snInfo;

        public Sninfo getSnInfo() {
            return this.snInfo;
        }

        public void setSnInfo(Sninfo snInfo) {
            this.snInfo = snInfo;
        }
    }

    public static class Result
            extends TaobaoObject {
        private static final long serialVersionUID = 7621145288923351967L;

        @ApiField("error_code")
        private String errorCode;

        @ApiField("error_msg")
        private String errorMsg;

        @ApiListField("sn_info_list")
        @ApiField("sninfolist")
        private List<Sninfolist> snInfoList;

        @ApiField("success")
        private Boolean success;

        @ApiField("total_count")
        private Long totalCount;

        public String getErrorCode() {
            return this.errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMsg() {
            return this.errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public List<Sninfolist> getSnInfoList() {
            return this.snInfoList;
        }

        public void setSnInfoList(List<Sninfolist> snInfoList) {
            this.snInfoList = snInfoList;
        }

        public Boolean getSuccess() {
            return this.success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Long getTotalCount() {
            return this.totalCount;
        }

        public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }
    }
}



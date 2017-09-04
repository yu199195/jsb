package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoCntmsMailnoGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4881222851745714798L;
    @ApiField("allocator_code")
    private String allocatorCode;
    @ApiField("allocator_name")
    private String allocatorName;
    @ApiField("logistics_code")
    private String logisticsCode;
    @ApiField("logistics_name")
    private String logisticsName;
    @ApiField("mailno")
    private String mailno;
    @ApiField("package_center_code")
    private String packageCenterCode;
    @ApiField("package_center_name")
    private String packageCenterName;
    @ApiField("sec_distribution")
    private String secDistribution;
    @ApiField("short_address")
    private String shortAddress;
    @ApiField("tms_code")
    private String tmsCode;
    @ApiField("tms_name")
    private String tmsName;

    public void setAllocatorCode(String allocatorCode) {
        this.allocatorCode = allocatorCode;
    }

    public String getAllocatorCode() {
        return this.allocatorCode;
    }

    public void setAllocatorName(String allocatorName) {
        this.allocatorName = allocatorName;
    }

    public String getAllocatorName() {
        return this.allocatorName;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getLogisticsCode() {
        return this.logisticsCode;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsName() {
        return this.logisticsName;
    }

    public void setMailno(String mailno) {
        this.mailno = mailno;
    }

    public String getMailno() {
        return this.mailno;
    }

    public void setPackageCenterCode(String packageCenterCode) {
        this.packageCenterCode = packageCenterCode;
    }

    public String getPackageCenterCode() {
        return this.packageCenterCode;
    }

    public void setPackageCenterName(String packageCenterName) {
        this.packageCenterName = packageCenterName;
    }

    public String getPackageCenterName() {
        return this.packageCenterName;
    }

    public void setSecDistribution(String secDistribution) {
        this.secDistribution = secDistribution;
    }

    public String getSecDistribution() {
        return this.secDistribution;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public void setTmsCode(String tmsCode) {
        this.tmsCode = tmsCode;
    }

    public String getTmsCode() {
        return this.tmsCode;
    }

    public void setTmsName(String tmsName) {
        this.tmsName = tmsName;
    }

    public String getTmsName() {
        return this.tmsName;
    }
}



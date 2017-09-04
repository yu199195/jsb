package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserEmployeeUpdateResponse;

import java.util.Date;
import java.util.Map;

public class SubuserEmployeeUpdateRequest
        extends BaseTaobaoRequest<SubuserEmployeeUpdateResponse> {
    private Long departmentId;
    private Long dutyId;
    private String employeeName;
    private String employeeNickname;
    private String employeeNum;
    private Boolean employeeTurnover;
    private Date entryDate;
    private String idCardNum;
    private Long leaderId;
    private String officePhone;
    private String personalEmail;
    private String personalMobile;
    private Long sex;
    private Long subId;
    private String workLocation;

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public Long getDutyId() {
        return this.dutyId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeNickname(String employeeNickname) {
        this.employeeNickname = employeeNickname;
    }

    public String getEmployeeNickname() {
        return this.employeeNickname;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmployeeNum() {
        return this.employeeNum;
    }

    public void setEmployeeTurnover(Boolean employeeTurnover) {
        this.employeeTurnover = employeeTurnover;
    }

    public Boolean getEmployeeTurnover() {
        return this.employeeTurnover;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getIdCardNum() {
        return this.idCardNum;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public void setPersonalMobile(String personalMobile) {
        this.personalMobile = personalMobile;
    }

    public String getPersonalMobile() {
        return this.personalMobile;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long getSex() {
        return this.sex;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getWorkLocation() {
        return this.workLocation;
    }

    public String getApiMethodName() {
        return "taobao.subuser.employee.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("duty_id", this.dutyId);
        txtParams.put("employee_name", this.employeeName);
        txtParams.put("employee_nickname", this.employeeNickname);
        txtParams.put("employee_num", this.employeeNum);
        txtParams.put("employee_turnover", this.employeeTurnover);
        txtParams.put("entry_date", this.entryDate);
        txtParams.put("id_card_num", this.idCardNum);
        txtParams.put("leader_id", this.leaderId);
        txtParams.put("office_phone", this.officePhone);
        txtParams.put("personal_email", this.personalEmail);
        txtParams.put("personal_mobile", this.personalMobile);
        txtParams.put("sex", this.sex);
        txtParams.put("sub_id", this.subId);
        txtParams.put("work_location", this.workLocation);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserEmployeeUpdateResponse> getResponseClass() {
        return SubuserEmployeeUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.subId, "subId");
    }
}



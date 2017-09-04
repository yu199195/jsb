package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.AddressReachable;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.LogisticsAddressReachablebatchGetResponse;

import java.util.List;
import java.util.Map;

public class LogisticsAddressReachablebatchGetRequest
        extends BaseTaobaoRequest<LogisticsAddressReachablebatchGetResponse> {
    private String addressList;

    public void setAddressList(String addressList) {
        this.addressList = addressList;
    }

    public void setAddressList(List<AddressReachable> addressList) {
        this.addressList = new JSONWriter(false, true).write(addressList);
    }

    public String getAddressList() {
        return this.addressList;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.reachablebatch.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address_list", this.addressList);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsAddressReachablebatchGetResponse> getResponseClass() {
        return LogisticsAddressReachablebatchGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkObjectMaxListSize(this.addressList, 20, "addressList");
    }
}



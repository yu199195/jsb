package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcQueueGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2823971844384427444L;
    @ApiListField("datas")
    @ApiField("tmc_queue_info")
    private List<TmcQueueInfo> datas;

    public void setDatas(List<TmcQueueInfo> datas) {
        this.datas = datas;
    }

    public List<TmcQueueInfo> getDatas() {
        return this.datas;
    }

    public static class TmcQueueInfo
            extends TaobaoObject {
        private static final long serialVersionUID = 3628551521776197721L;

        @ApiField("broker_name")
        private String brokerName;

        @ApiField("get_total")
        private Long getTotal;

        @ApiField("name")
        private String name;

        @ApiField("put_toal")
        private Long putToal;

        public String getBrokerName() {
            return this.brokerName;
        }

        public void setBrokerName(String brokerName) {
            this.brokerName = brokerName;
        }

        public Long getGetTotal() {
            return this.getTotal;
        }

        public void setGetTotal(Long getTotal) {
            this.getTotal = getTotal;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getPutToal() {
            return this.putToal;
        }

        public void setPutToal(Long putToal) {
            this.putToal = putToal;
        }
    }
}



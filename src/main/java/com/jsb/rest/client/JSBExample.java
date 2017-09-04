package com.jsb.rest.client;

import com.jsb.rest.comm.JSBRestException;
import com.jsb.rest.request.trade.JSBTradesSoldIncrementGetRequest;
import com.taobao.api.domain.Item;
import com.taobao.api.domain.Order;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.AreasGetRequest;
import com.taobao.api.request.ItemAddRequest;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.request.LogisticsCompaniesGetRequest;
import com.taobao.api.request.LogisticsDummySendRequest;
import com.taobao.api.request.LogisticsOrdersDetailGetRequest;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.request.TradeGetRequest;
import com.taobao.api.request.TradeMemoAddRequest;
import com.taobao.api.request.TradeMemoUpdateRequest;
import com.taobao.api.request.TradesSoldGetRequest;
import com.taobao.api.request.TradesSoldIncrementGetRequest;
import com.taobao.api.response.AreasGetResponse;
import com.taobao.api.response.ItemAddResponse;
import com.taobao.api.response.ItemSellerGetResponse;
import com.taobao.api.response.LogisticsCompaniesGetResponse;
import com.taobao.api.response.LogisticsDummySendResponse;
import com.taobao.api.response.LogisticsOrdersDetailGetResponse;
import com.taobao.api.response.TradeFullinfoGetResponse;
import com.taobao.api.response.TradeGetResponse;
import com.taobao.api.response.TradeMemoAddResponse;
import com.taobao.api.response.TradeMemoUpdateResponse;
import com.taobao.api.response.TradesSoldGetResponse;
import com.taobao.api.response.TradesSoldIncrementGetResponse;

import java.io.PrintStream;
import java.util.List;

public class JSBExample {
    private static final String AK = "fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036";
    private static final String SK = "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a";

    public static void testLogisticsCompaniesGetRequest()
            throws JSBRestException {
        LogisticsCompaniesGetRequest req = new LogisticsCompaniesGetRequest();
        req.setFields("id,code,name,reg_mail_no");
        JSBClient c = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        LogisticsCompaniesGetResponse resp = (LogisticsCompaniesGetResponse) c.execute(req);
        System.out.println(resp.getBody());
    }

    public static void testAreasGetRequest()
            throws JSBRestException {
        AreasGetRequest areaReq = new AreasGetRequest();
        areaReq.setFields("id");
        JSBClient c = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        AreasGetResponse resp = (AreasGetResponse) c.execute(areaReq);
        System.out.println(resp.getBody());
    }

    public static void testItemSellerGetRequest()
            throws JSBRestException {
        ItemSellerGetRequest req = new ItemSellerGetRequest();
        req.setFields("num_iid,title,props,price,approve_status,sku");
        req.setNumIid(Long.valueOf(2200783011403L));
        JSBClient c = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        ItemSellerGetResponse rsp = (ItemSellerGetResponse) c.execute(req);
        Item item = rsp.getItem();
        System.out.println(item.getTitle());
        System.out.println(rsp.getBody());
    }

    public static void testTradeFullGet()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
        req.setFields("tid,type,status,payment,orders");
        req.setTid(Long.valueOf(1988482578932334L));
        TradeFullinfoGetResponse rsp = (TradeFullinfoGetResponse) client.execute(req);
        System.out.println(rsp.getBody());
        Trade trade = rsp.getTrade();
        System.out.println(trade.getTid());
        List<Order> orders = trade.getOrders();
        for (Order order : orders) {
            System.out.println(order.getTitle());
        }
    }

    public static void testTradeSoldGet()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradesSoldGetRequest req = new TradesSoldGetRequest();
        req.setFields("tid,receiver_name,buyer_nick,service_orders,receiver_mobile,receiver_phone,receiver_address,alipay_id,type,status,payment");
        req.setStartCreated(StringUtils.parseDateTime("2017-06-10 22:00:00"));
        req.setEndCreated(StringUtils.parseDateTime("2017-07-20 22:59:59"));

        TradesSoldGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        List<Trade> trades = rsp.getTrades();
        for (Trade trade : trades) {
            System.out.println(trade.getTid());
            List<Order> orders = trade.getOrders();
            for (Order order : orders) {
                System.out.println(order.getTitle());
            }
        }
    }

    public static void testTradesSoldIncrementGet()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradesSoldIncrementGetRequest req = new TradesSoldIncrementGetRequest();
        req.setStatus("WAIT_BUYER_CONFIRM_GOODS");
        req.setFields("tid,type,status,payment,orders,rx_audit_status");
        req.setStartModified(StringUtils.parseDateTime("2016-06-20 11:11:11"));
        req.setEndModified(StringUtils.parseDateTime("2016-06-20 23:59:59"));
        req.setPageNo(Long.valueOf(1L));
        req.setPageSize(Long.valueOf(40L));
        req.setUseHasNext(Boolean.valueOf(true));
        TradesSoldIncrementGetResponse rsp = (TradesSoldIncrementGetResponse) client.execute(req);
        List<Trade> trades = rsp.getTrades();
        for (Trade trade : trades) {
            System.out.println(trade.getTid());
            List<Order> orders = trade.getOrders();
            for (Order order : orders) {
                System.out.println(order.getTitle());
            }
        }
    }

    public static void testLogisticsOrdersDetailGetRequest()
            throws JSBRestException {
        LogisticsOrdersDetailGetRequest req = new LogisticsOrdersDetailGetRequest();
        req.setFields("receiver_mobile,tid,order_code,seller_nick,buyer_nick,item_title,receiver_location,status,type,company_name,created,is_quick_cod_order,sub_tids,is_split");
        req.setType("express");
        req.setPageNo(Long.valueOf(1L));
        req.setPageSize(Long.valueOf(40L));
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        LogisticsOrdersDetailGetResponse resp = (LogisticsOrdersDetailGetResponse) client.execute(req);
        System.out.println(resp.getBody());
    }

    public static void testJsbIncrementTradeGet() throws JSBRestException {
        JSBTradesSoldIncrementGetRequest req = new JSBTradesSoldIncrementGetRequest();
        req.setStartModified("2017-05-08 01:02:03");
        req.setEndModified("2017-05-08 21:02:03");
        req.setFields("tid,type,status,payment,orders,rx_audit_status");
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradesSoldIncrementGetResponse resp = (TradesSoldIncrementGetResponse) client.executeJsbReq(req);
        System.out.println(resp.getBody());
    }

    public static void testTradeGet()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradeGetRequest req = new TradeGetRequest();
        req.setFields("tid,type,status,payment,seller_memo");
        req.setTid(Long.valueOf(1988482578932334L));
        TradeGetResponse rsp = (TradeGetResponse) client.execute(req);
        System.out.println(rsp.getBody());
    }

    public static void testTradeMemoAdd()
            throws JSBRestException {
        TradeMemoAddRequest req = new TradeMemoAddRequest();
        req.setTid(Long.valueOf(1988482578932334L));
        req.setMemo("交易备注");
        req.setFlag(Long.valueOf(1L));
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradeMemoAddResponse rsp = (TradeMemoAddResponse) client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static void testTradeMemoUpdate()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        TradeMemoUpdateRequest req = new TradeMemoUpdateRequest();
        req.setTid(Long.valueOf(1988482578932334L));
        req.setMemo("交易备注new");
        req.setFlag(Long.valueOf(1L));
        TradeMemoUpdateResponse rsp = (TradeMemoUpdateResponse) client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static void testLogisticsDummySend()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");

        LogisticsDummySendRequest req = new LogisticsDummySendRequest();
        req.setTid(Long.valueOf(2003142416134634L));
        LogisticsDummySendResponse rsp = (LogisticsDummySendResponse) client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static ItemAddResponse testItemAddRest()
            throws JSBRestException {
        JSBClient client = new JSBClient("fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036", "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a");
        ItemAddRequest req = new ItemAddRequest();
        req.setDesc("this is desc");
        req.setLocationCity("成都");
        req.setLocationState("四川");
        req.setNum(Long.valueOf(40L));
        req.setTitle("测试");
        req.setCid(Long.valueOf(150704L));
        req.setStuffStatus("new");
        req.setType("fixed");
        req.setPrice("105.5");
        req.setIsTaobao(Boolean.valueOf(true));
        req.setInputCustomCpv("1627207:-1:测试1;1627207:-2:测试2");
        req.setSkuPrices("105.50,105.50");
        req.setSkuProperties("1627207:-1,1627207:-2");
        req.setSkuQuantities("10,30");
        req.setSkuOuterIds("1,2");
        req.setProps("20021:109098;122276315:106609795;28102:30111;26124712:49668935;20608:125200612;20000:29534;1627207:-1;1627207:-2");
        req.setInputPids("20000");
        req.setInputStr("other/其他;型号;硬壳-黑白方格");
        req.setDesc("<img align=\"absmiddle\" src=\"https://img.alicdn.com/imgextra/i3/67226091/TB20RQzbXXXXXXLXpXXXXXXXXXX-67226091.jpg\"\\ />");
        ItemAddResponse resp = (ItemAddResponse) client.execute(req, "item/ItemAddRequest");
        System.out.println(resp.getBody());
        return resp;
    }

    public static void main(String[] args) {
        try {
            JSBClient.setServerUrl("http://120.55.113.176:30001/JSB/rest/");

            testAreasGetRequest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



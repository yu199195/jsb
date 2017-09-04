package com;

import java.util.List;

import com.jsb.rest.client.JSBClient;
import com.jsb.rest.comm.JSBRestException;
import com.taobao.api.domain.Item;
import com.taobao.api.domain.Order;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.AreasGetRequest;
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

public class JSBExample {

    private static final String AK = "fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036";
    private static final String SK = "5333165117501c430862ac389f0f9da5292d5cbec711d74ef7d2525e4385957a";

    public static void testLogisticsCompaniesGetRequest()
            throws JSBRestException {
        LogisticsCompaniesGetRequest req = new LogisticsCompaniesGetRequest();
        req.setFields("id,code,name,reg_mail_no");
        JSBClient c = new JSBClient(AK, SK);
        LogisticsCompaniesGetResponse resp = c.execute(req);
        System.out.println(resp.getBody());
    }

    public static void testAreasGetRequest()
            throws JSBRestException {
        AreasGetRequest areaReq = new AreasGetRequest();
        areaReq.setFields("id");
        JSBClient c = new JSBClient(AK, SK);
        AreasGetResponse resp = c.execute(areaReq);
        System.out.println(resp.getBody());
    }

    public static void testItemSellerGetRequest()
            throws JSBRestException {
        ItemSellerGetRequest req = new ItemSellerGetRequest();
        req.setFields("num_iid,title,props,price,approve_status,sku");
        req.setNumIid(2200783011403L);
        JSBClient c = new JSBClient(AK, SK);
        ItemSellerGetResponse rsp = c.execute(req);
        Item item = rsp.getItem();
        System.out.println(item.getTitle());
        System.out.println(rsp.getBody());
    }

    public static void testTradeFullGet()
            throws JSBRestException {
        JSBClient client = new JSBClient(AK, SK);
        TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
        req.setFields("tid,type,status,payment,orders");
        req.setTid(1988482578932334L);
        TradeFullinfoGetResponse rsp = client.execute(req);
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
        JSBClient client = new JSBClient(AK, SK);
        TradesSoldGetRequest req = new TradesSoldGetRequest();
        req.setFields("tid,type,status,payment");
        req.setStartCreated(StringUtils.parseDateTime("2016-06-10 22:00:00"));
        req.setEndCreated(StringUtils.parseDateTime("2016-06-20 22:59:59"));

        req.setPageNo(1L);
        req.setPageSize(40L);
        req.setUseHasNext(true);
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
        JSBClient client = new JSBClient(AK, SK);
        TradesSoldIncrementGetRequest req = new TradesSoldIncrementGetRequest();
        req.setStatus("WAIT_BUYER_CONFIRM_GOODS");
        req.setFields("tid,type,status,payment,orders,rx_audit_status");
        req.setStartModified(StringUtils.parseDateTime("2016-06-20 00:00:00"));
        req.setEndModified(StringUtils.parseDateTime("2016-06-20 23:59:59"));
        req.setPageNo(1L);
        req.setPageSize(40L);
        req.setUseHasNext(true);
        TradesSoldIncrementGetResponse rsp = client.execute(req);
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
        req.setPageNo(1L);
        req.setPageSize(40L);
        JSBClient client = new JSBClient(AK, SK);
        LogisticsOrdersDetailGetResponse resp = client.execute(req);
        System.out.println(resp.getBody());
    }

    public static void testTradeGet()
            throws JSBRestException {
        JSBClient client = new JSBClient(AK, SK);
        TradeGetRequest req = new TradeGetRequest();
        req.setFields("tid,type,status,payment,seller_memo");
        req.setTid(1988482578932334L);
        TradeGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }

    public static void testTradeMemoAdd()
            throws JSBRestException {
        TradeMemoAddRequest req = new TradeMemoAddRequest();
        req.setTid(1988482578932334L);
        req.setMemo("交易备注");
        req.setFlag(1L);
        JSBClient client = new JSBClient(AK, SK);
        TradeMemoAddResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static void testTradeMemoUpdate()
            throws JSBRestException {
        JSBClient client = new JSBClient(AK, SK);
        TradeMemoUpdateRequest req = new TradeMemoUpdateRequest();
        req.setTid(1988482578932334L);
        req.setMemo("交易备注new");
        req.setFlag(1L);
        TradeMemoUpdateResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static void testLogisticsDummySend()
            throws JSBRestException {
        JSBClient client = new JSBClient(AK, SK);

        LogisticsDummySendRequest req = new LogisticsDummySendRequest();
        req.setTid(2003142416134634L);
        LogisticsDummySendResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }

    public static void main(String args[]) {
        try {
            testTradeSoldGet();
            testTradesSoldIncrementGet();
            testTradeFullGet();
            testTradeMemoAdd();
            testTradeMemoUpdate();
            testTradeGet();
            testLogisticsDummySend();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

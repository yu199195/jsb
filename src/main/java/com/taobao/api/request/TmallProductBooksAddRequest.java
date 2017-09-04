package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductBooksAddResponse;

import java.util.HashMap;
import java.util.Map;

public class TmallProductBooksAddRequest
        extends BaseTaobaoRequest<TmallProductBooksAddResponse>
        implements TaobaoUploadRequest<TmallProductBooksAddResponse> {
    private String abstractMsg;
    private String appInfo;
    private String author;
    private String authorArea;
    private String barCode;
    private String bookBind;
    private Long bookSize;
    private Long bookVersion;
    private String catalog;
    private Long categoryId;
    private String chinaClassifyNo;
    private String cip;
    private String commentator;
    private String customId;
    private String deputyName;
    private String drawor;
    private String editor;
    private String graphor;
    private FileItem image;
    private String isbn;
    private String itemIds;
    private String narrator;
    private String partName;
    private Long partNo;
    private String plottor;
    private String price;
    private String publishCompany;
    private String publishYm;
    private String reginYear;
    private String scholisat;
    private String seriesBooksName;
    private String summary;
    private String translator;

    public void setAbstractMsg(String abstractMsg) {
        this.abstractMsg = abstractMsg;
    }

    public String getAbstractMsg() {
        return this.abstractMsg;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public String getAppInfo() {
        return this.appInfo;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthorArea(String authorArea) {
        this.authorArea = authorArea;
    }

    public String getAuthorArea() {
        return this.authorArea;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBookBind(String bookBind) {
        this.bookBind = bookBind;
    }

    public String getBookBind() {
        return this.bookBind;
    }

    public void setBookSize(Long bookSize) {
        this.bookSize = bookSize;
    }

    public Long getBookSize() {
        return this.bookSize;
    }

    public void setBookVersion(Long bookVersion) {
        this.bookVersion = bookVersion;
    }

    public Long getBookVersion() {
        return this.bookVersion;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        return this.catalog;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setChinaClassifyNo(String chinaClassifyNo) {
        this.chinaClassifyNo = chinaClassifyNo;
    }

    public String getChinaClassifyNo() {
        return this.chinaClassifyNo;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getCip() {
        return this.cip;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator;
    }

    public String getCommentator() {
        return this.commentator;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public String getCustomId() {
        return this.customId;
    }

    public void setDeputyName(String deputyName) {
        this.deputyName = deputyName;
    }

    public String getDeputyName() {
        return this.deputyName;
    }

    public void setDrawor(String drawor) {
        this.drawor = drawor;
    }

    public String getDrawor() {
        return this.drawor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setGraphor(String graphor) {
        this.graphor = graphor;
    }

    public String getGraphor() {
        return this.graphor;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getNarrator() {
        return this.narrator;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartName() {
        return this.partName;
    }

    public void setPartNo(Long partNo) {
        this.partNo = partNo;
    }

    public Long getPartNo() {
        return this.partNo;
    }

    public void setPlottor(String plottor) {
        this.plottor = plottor;
    }

    public String getPlottor() {
        return this.plottor;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    public String getPublishCompany() {
        return this.publishCompany;
    }

    public void setPublishYm(String publishYm) {
        this.publishYm = publishYm;
    }

    public String getPublishYm() {
        return this.publishYm;
    }

    public void setReginYear(String reginYear) {
        this.reginYear = reginYear;
    }

    public String getReginYear() {
        return this.reginYear;
    }

    public void setScholisat(String scholisat) {
        this.scholisat = scholisat;
    }

    public String getScholisat() {
        return this.scholisat;
    }

    public void setSeriesBooksName(String seriesBooksName) {
        this.seriesBooksName = seriesBooksName;
    }

    public String getSeriesBooksName() {
        return this.seriesBooksName;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getTranslator() {
        return this.translator;
    }

    public String getApiMethodName() {
        return "tmall.product.books.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("abstract_msg", this.abstractMsg);
        txtParams.put("app_info", this.appInfo);
        txtParams.put("author", this.author);
        txtParams.put("author_area", this.authorArea);
        txtParams.put("bar_code", this.barCode);
        txtParams.put("book_bind", this.bookBind);
        txtParams.put("book_size", this.bookSize);
        txtParams.put("book_version", this.bookVersion);
        txtParams.put("catalog", this.catalog);
        txtParams.put("category_id", this.categoryId);
        txtParams.put("china_classify_no", this.chinaClassifyNo);
        txtParams.put("cip", this.cip);
        txtParams.put("commentator", this.commentator);
        txtParams.put("custom_id", this.customId);
        txtParams.put("deputy_name", this.deputyName);
        txtParams.put("drawor", this.drawor);
        txtParams.put("editor", this.editor);
        txtParams.put("graphor", this.graphor);
        txtParams.put("isbn", this.isbn);
        txtParams.put("item_ids", this.itemIds);
        txtParams.put("narrator", this.narrator);
        txtParams.put("part_name", this.partName);
        txtParams.put("part_no", this.partNo);
        txtParams.put("plottor", this.plottor);
        txtParams.put("price", this.price);
        txtParams.put("publish_company", this.publishCompany);
        txtParams.put("publish_ym", this.publishYm);
        txtParams.put("regin_year", this.reginYear);
        txtParams.put("scholisat", this.scholisat);
        txtParams.put("series_books_name", this.seriesBooksName);
        txtParams.put("summary", this.summary);
        txtParams.put("translator", this.translator);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductBooksAddResponse> getResponseClass() {
        return TmallProductBooksAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.appInfo, "appInfo");
        RequestCheckUtils.checkMaxLength(this.appInfo, 40, "appInfo");
        RequestCheckUtils.checkNotEmpty(this.author, "author");
        RequestCheckUtils.checkMaxLength(this.author, 80, "author");
        RequestCheckUtils.checkMaxLength(this.authorArea, 80, "authorArea");
        RequestCheckUtils.checkNotEmpty(this.barCode, "barCode");
        RequestCheckUtils.checkMaxLength(this.barCode, 20, "barCode");
        RequestCheckUtils.checkNotEmpty(this.bookBind, "bookBind");
        RequestCheckUtils.checkMaxLength(this.bookBind, 10, "bookBind");
        RequestCheckUtils.checkMaxLength(this.catalog, 8000, "catalog");
        RequestCheckUtils.checkNotEmpty(this.categoryId, "categoryId");
        RequestCheckUtils.checkMaxLength(this.chinaClassifyNo, 30, "chinaClassifyNo");
        RequestCheckUtils.checkMaxLength(this.cip, 50, "cip");
        RequestCheckUtils.checkMaxLength(this.commentator, 40, "commentator");
        RequestCheckUtils.checkNotEmpty(this.customId, "customId");
        RequestCheckUtils.checkNotEmpty(this.deputyName, "deputyName");
        RequestCheckUtils.checkMaxLength(this.deputyName, 150, "deputyName");
        RequestCheckUtils.checkMaxLength(this.drawor, 40, "drawor");
        RequestCheckUtils.checkMaxLength(this.editor, 40, "editor");
        RequestCheckUtils.checkMaxLength(this.graphor, 40, "graphor");
        RequestCheckUtils.checkNotEmpty(this.isbn, "isbn");
        RequestCheckUtils.checkMaxLength(this.isbn, 13, "isbn");
        RequestCheckUtils.checkMaxLength(this.narrator, 40, "narrator");
        RequestCheckUtils.checkMaxLength(this.partName, 150, "partName");
        RequestCheckUtils.checkMaxLength(this.plottor, 40, "plottor");
        RequestCheckUtils.checkNotEmpty(this.price, "price");
        RequestCheckUtils.checkMaxLength(this.price, 40, "price");
        RequestCheckUtils.checkMaxLength(this.publishCompany, 80, "publishCompany");
        RequestCheckUtils.checkMaxLength(this.reginYear, 10, "reginYear");
        RequestCheckUtils.checkMaxLength(this.scholisat, 40, "scholisat");
        RequestCheckUtils.checkMaxLength(this.seriesBooksName, 150, "seriesBooksName");
        RequestCheckUtils.checkMaxLength(this.summary, 5000, "summary");
        RequestCheckUtils.checkMaxLength(this.translator, 40, "translator");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}



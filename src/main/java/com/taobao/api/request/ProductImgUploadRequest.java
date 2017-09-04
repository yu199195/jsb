package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductImgUploadResponse;

import java.util.HashMap;
import java.util.Map;

public class ProductImgUploadRequest
        extends BaseTaobaoRequest<ProductImgUploadResponse>
        implements TaobaoUploadRequest<ProductImgUploadResponse> {
    private Long id;
    private FileItem image;
    private Boolean isMajor;
    private Long position;
    private Long productId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public Boolean getIsMajor() {
        return this.isMajor;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getApiMethodName() {
        return "taobao.product.img.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_major", this.isMajor);
        txtParams.put("position", this.position);
        txtParams.put("product_id", this.productId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ProductImgUploadResponse> getResponseClass() {
        return ProductImgUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.image, "image");
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}



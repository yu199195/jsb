package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemPropimgUploadResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JSBItemPropimgUploadRequest
        extends JSBRequest<ItemPropimgUploadResponse> {
    private File picFile;

    public void setPoperties(String prpoerties) {
        this.queryMaps.put("properties", prpoerties);
    }

    public void setItemId(String num_iid) {
        this.queryMaps.put("num_iid", num_iid);
    }

    public String getResourceUrl() {
        return "item/ItemPropimgUploadRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<ItemPropimgUploadResponse> getResponseClass() {
        return ItemPropimgUploadResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
        if (this.picFile.length() > 512000L) {
            throw new ApiRuleException("41", "client-error:Invalid arguments: picture is too large");
        }
    }

    public Object getEntity() {
        int fileSize = (int) this.picFile.length();
        byte[] tempbytes = new byte[fileSize];
        InputStream in = null;
        try {
            in = new FileInputStream(this.picFile);

            int byteReaded = 0;
            while (byteReaded < fileSize) {
                int left = fileSize - byteReaded;
                byteReaded += in.read(tempbytes, byteReaded, left);
            }

            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return tempbytes;
        } catch (IOException e) {
            e.printStackTrace();

            if (null != in) {
                try {
                    in.close();
                } catch (IOException e2) {
                    e.printStackTrace();
                }
            }
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public void postHandler() {
    }

    public String getType() {
        return null;
    }

    public void setFilePath(String filePath) {
        this.picFile = new File(filePath);
    }
}



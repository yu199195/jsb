package com.jsb.rest.request.multimedia;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureUploadResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JSBPictureUploadRequest
        extends JSBRequest<PictureUploadResponse> {
    private File picFile;

    public void setCatalogId(long picture_category_id) {
        this.queryMaps.put("picture_category_id", String.valueOf(picture_category_id));
    }

    public void setTitle(String title) {
        this.queryMaps.put("image_input_title", title);
    }

    public String getResourceUrl() {
        return "multimedia/PictureUploadRequest";
    }

    public JSBHttpMethod getMethod() {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }

    public Class<PictureUploadResponse> getResponseClass() {
        return PictureUploadResponse.class;
    }

    public void checkParameter()
            throws ApiRuleException {
        if (this.picFile.length() > 35651584L) {
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



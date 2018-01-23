package com.json.itdaily.modle;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/14.
 */

public class HttpStatus {
    @SerializedName("error_code")
    private int mCode;
    @SerializedName("msg")
    private String mMessage;

    public int getCode() {
        return mCode;
    }

    public String getMessage() {
        return mMessage;
    }

}

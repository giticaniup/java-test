package com.kode.test.inter;

import com.google.common.base.MoreObjects;

/**
 * Created by zhongcy on 2016/4/15.
 */
public enum ErrorCodeEnum {

    PARAM_ILLEGAL(1, "illgal", "paramillger"),

    TWO_ILLEGAL(1, "two"),;
    private int errorCode;
    private String errorMsg;
    private String description;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    ErrorCodeEnum(int errorCode, String errorMsg, String description) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.description = description;
    }

    ErrorCodeEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("errorCode", errorCode)
                .add("errorMsg", errorMsg)
                .add("description", description)
                .toString();
    }

}

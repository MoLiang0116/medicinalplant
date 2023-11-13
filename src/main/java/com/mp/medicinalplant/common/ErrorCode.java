package com.mp.medicinalplant.common;

import lombok.Data;

public enum ErrorCode {
    SUCCESS(0,"success",""),
    PARAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"请求为空",""),
    NOT_LOGIN(40100,"用户未登录",""),
    NO_AUTH(40101,"无权限",""),
    REGISTER_FAILED(41000,"注册失败",""),
    Query_FAILED(41001,"查询失败",""),
    SYSTEM_ERROR(50000,"系统内部错误","");
    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}

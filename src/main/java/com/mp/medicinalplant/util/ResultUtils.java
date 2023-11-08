package com.mp.medicinalplant.util;

import com.mp.medicinalplant.common.BaseResponse;
import com.mp.medicinalplant.common.ErrorCode;

public class ResultUtils {
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse(0,data,"success");
    }
    public static BaseResponse error(ErrorCode errorCode){
        return new BaseResponse(errorCode.getCode(),errorCode.getMessage(),errorCode.getDescription());
    }
    public static BaseResponse error(int code,String message,String description){
        return new BaseResponse(code,message,description);
    }
    public static BaseResponse error(ErrorCode errorCode,String message,String description){
        return new BaseResponse(errorCode.getCode(),message,description);
    }
}

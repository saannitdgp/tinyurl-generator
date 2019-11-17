package com.sandeep.objects.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse<T> {

    T data;
     ResultInfo resultInfo;

    public BaseResponse(){

    }

    public BaseResponse(T data , String message, String code) {
        this.data = data;
        this.resultInfo = new ResultInfo(message,code);
    }
    @Getter
    @Setter
    public static class ResultInfo {
        String message;
        String code;

        public ResultInfo(){
        }
        public ResultInfo(String message, String code){
            this.message = message;
            this.code = code;
        }
    }

}

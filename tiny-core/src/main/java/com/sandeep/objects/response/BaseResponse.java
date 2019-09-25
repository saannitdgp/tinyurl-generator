package com.sandeep.objects.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResponse<T> {
    T data;
    ResultInfo resultInfo;
}


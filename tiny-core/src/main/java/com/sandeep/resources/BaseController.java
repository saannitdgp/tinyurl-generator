package com.sandeep.resources;

import com.sandeep.objects.constants.BaseConstants;
import com.sandeep.objects.response.BaseResponse;
import com.sandeep.objects.response.ResultInfo;

public class BaseController {
    protected void setSuccessResultInfo(BaseResponse response) {

        ResultInfo resultInfo = new ResultInfo(BaseConstants.DEFAULT_RESULT_CODE_ID, "SUCCESS" , BaseConstants.DEFAULT_RESULT_MSG_SUCCESS);
        response.setResultInfo(resultInfo);
    }
}

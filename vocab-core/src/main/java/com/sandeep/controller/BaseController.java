package com.sandeep.controller;

import com.sandeep.objects.constants.VocabConstants;
import com.sandeep.objects.response.BaseResponse;

public class BaseController {

	protected void setSuccessfulResponse(BaseResponse baseResponse) {
		BaseResponse.ResultInfo resultInfo = new BaseResponse.ResultInfo();
		resultInfo.setCode(VocabConstants.ApiReponseCode.SUCCESS);
		resultInfo.setMessage(VocabConstants.ApiReponseMessage.SUCCESS);
		baseResponse.setResultInfo(resultInfo);
	}
}

package com.sandeep.controller;

import com.sandeep.objects.request.AddWordRequest;
import com.sandeep.objects.response.BaseResponse;
import com.sandeep.objects.response.WordInfoResponse;
import com.sandeep.service.IVocabGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class VocabGeneratorController extends BaseController {

    @Autowired
	private IVocabGeneratorService vocabGeneratorService;

	@RequestMapping(value = "/v1/words",method = RequestMethod.POST)
	ResponseEntity<BaseResponse<String> > addWord(@Valid @RequestBody AddWordRequest request) {

		BaseResponse<String> baseResponse = new BaseResponse<>();
		vocabGeneratorService.addWord(request);
		setSuccessfulResponse(baseResponse);
		return ResponseEntity.ok(baseResponse);
	}

	@RequestMapping(value = "/v1/get_word_info",method = RequestMethod.GET)
	ResponseEntity<BaseResponse<WordInfoResponse>> getWordInfo(@RequestParam(name = "word") String word) {

		BaseResponse<WordInfoResponse> baseResponse = new BaseResponse<>();
		baseResponse.setData(vocabGeneratorService.searchWordInfo(word));
		setSuccessfulResponse(baseResponse);
		return ResponseEntity.ok(baseResponse);
	}

	@RequestMapping(value = "/v1/test",method = RequestMethod.POST)
	String get(@Valid @RequestBody AddWordRequest request){
		return ("OK");
	}
}

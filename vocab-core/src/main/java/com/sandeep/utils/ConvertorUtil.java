package com.sandeep.utils;


import com.sandeep.entity.WordInfo;
import com.sandeep.objects.request.AddWordRequest;
import com.sandeep.objects.response.WordInfoResponse;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ConvertorUtil {

	public WordInfo getWordInfoFromRequest(AddWordRequest request) {
		if (request != null) {
		  return getWordInfo(request);
		}
		return  null;
	}
	private WordInfo getWordInfo(AddWordRequest requestedWord) {

		WordInfo wordInfo = new WordInfo();
		StringBuilder stringBuilder = new StringBuilder();
		if (requestedWord.getSynonyms() != null) {
			for (String str : requestedWord.getSynonyms()) {
				str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
				stringBuilder.append(str + "-");
			}
		}
		wordInfo.setWord(requestedWord.getWord());
		wordInfo.setListOfSynonyms(stringBuilder.toString());
		wordInfo.setDescription(requestedWord.getDescription());
		wordInfo.setTranslationInHindi(requestedWord.getTranslationInHindi());
		wordInfo.setCreatedAt(new Timestamp(System.currentTimeMillis()));
		wordInfo.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
		return wordInfo;
	}

	public WordInfoResponse getWordInfoResponseFromWordInfo(WordInfo wordInfo) {
		WordInfoResponse response = new WordInfoResponse();
		if(wordInfo != null) {
			response.setDescription(wordInfo.getDescription());
			response.setWord(wordInfo.getWord());
			response.setSynonyms(wordInfo.getListOfSynonyms());
			response.setTranslationInHindi(wordInfo.getTranslationInHindi());
		}
		return response;
	}
}

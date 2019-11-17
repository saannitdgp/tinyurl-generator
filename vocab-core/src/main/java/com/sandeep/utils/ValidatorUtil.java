package com.sandeep.utils;


import com.sandeep.exception.InvaildDataException;
import com.sandeep.objects.constants.VocabConstants;
import com.sandeep.objects.request.AddWordRequest;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ValidatorUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorUtil.class);

	public void isValidAddWordRequest(AddWordRequest request) throws InvaildDataException {

		boolean isValid = true;

		LOGGER.info("=== Validating add word request===", request);

		if (request == null) {
			LOGGER.info("=== Empty Request ===");
			throw new InvaildDataException("Empty data.", VocabConstants.ApiReponseCode.INVAILD_DATA);
		}

			if (StringUtils.isEmpty(request.getWord()) && request.getWord().length() < 2) {
				throw new InvaildDataException("Word not present in input request.",
						VocabConstants.ApiReponseCode.INVAILD_DATA);
			}
			if (CollectionUtils.isEmpty(request.getSynonyms()) || request.getSynonyms().size() >= 5) {

				throw new InvaildDataException("At least one or less then five synonyms should be present ",
						VocabConstants.ApiReponseCode.INVAILD_DATA);
			}
			if (StringUtils.isEmpty(request.getDescription())) {
				throw new InvaildDataException("Description must be present.", VocabConstants.ApiReponseCode.INVAILD_DATA);
			}

			//Format the given word.
			request.setWord(convertWordIntoCamelCase(request.getWord()));
	}

	private String convertWordIntoCamelCase(String word){

		word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		return word;
	}

}

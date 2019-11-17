package com.sandeep.service;


import com.sandeep.objects.request.AddWordRequest;
import com.sandeep.objects.response.WordInfoResponse;

import java.util.Set;

public interface IVocabGeneratorService {

    /**
     * add word into your dictionary.
     * @param addWordRequest
     */
    void addWord(AddWordRequest addWordRequest);

    WordInfoResponse searchWordInfo(String word);
}

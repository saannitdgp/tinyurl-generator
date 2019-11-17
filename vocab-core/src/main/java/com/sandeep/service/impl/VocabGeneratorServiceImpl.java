package com.sandeep.service.impl;

import com.sandeep.dao.IWordInfoDao;
import com.sandeep.entity.WordInfo;
import com.sandeep.exception.NoDataFoundException;
import com.sandeep.objects.request.AddWordRequest;
import com.sandeep.objects.response.WordInfoResponse;
import com.sandeep.service.IVocabGeneratorService;
import com.sandeep.utils.ConvertorUtil;
import com.sandeep.utils.ValidatorUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;

@Service(value = "vocabGeneratorImpl")
public class VocabGeneratorServiceImpl implements IVocabGeneratorService {

    @Autowired
    private ConvertorUtil convertorUtil;

    @Autowired
    private ValidatorUtil validatorUtil;

    @Autowired
    private IWordInfoDao wordInfoDao;

    @Override
    public void addWord(AddWordRequest addWordRequest) {

        WordInfo wordInfo = convertorUtil.getWordInfoFromRequest(addWordRequest);
        validatorUtil.isValidAddWordRequest(addWordRequest);
        if(wordInfo != null) {
                 wordInfoDao.save(wordInfo);
        }
    }

    @Override
    public WordInfoResponse searchWordInfo(String word) {
      WordInfoResponse response = convertorUtil.getWordInfoResponseFromWordInfo(wordInfoDao.fetchWordInfoByName(word));
      if(response.getWord()== null) {
          throw  new NoDataFoundException("NO DATA FOUND","404");
      }
      return response;
    }
}

package com.sandeep.service.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.Demo;
import com.sandeep.entity.TinyUrlInfo;
import com.sandeep.service.ITinyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service("tinyUrlService")
public class TinyURLServiceImpl implements ITinyURLService {

    @Autowired
    private ITinyURLDao tinyURLDao;
    @Override public String createTinyURL(String longURL) {
        TinyUrlInfo tinyUrlInfo = new TinyUrlInfo();
        tinyUrlInfo.setId(10L);
        tinyUrlInfo.setTinyURL("sabdee");
        tinyUrlInfo.setLongURL(longURL);
        tinyUrlInfo.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        tinyUrlInfo.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
       // tinyURLDao.saveNewRecord(tinyUrlInfo);
        Demo d = new Demo();
        d.setId(10L);
        d.setAge("20");
        d.setName("sand");
        tinyURLDao.save(d);
        return tinyUrlInfo.toString();
    }
}

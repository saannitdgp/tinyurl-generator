package com.sandeep.dao;

import com.sandeep.entity.TinyUrlInfo;

public interface ITinyURLDao {

    void saveNewRecord(TinyUrlInfo tinyUrlInfo);

    void save(Object object);

}

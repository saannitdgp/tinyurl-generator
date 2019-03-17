package com.sandeep.dao.impl;

import com.sandeep.dao.GenericDaoImpl;
import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.TinyUrlInfo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TinyURLDaoImpl extends GenericDaoImpl implements ITinyURLDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void saveNewRecord(TinyUrlInfo tinyUrlInfo) {
          getCurrentSession().save(tinyUrlInfo);
    }

    @Transactional
    @Override public void save(Object object) {
       getCurrentSession().save(object);
    }
}

package com.sandeep.service.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.service.ITinyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "tinyURLServiceImpl")
public class TinyURLServiceImpl implements ITinyURLService {

    @Autowired
    private ITinyURLDao tinyURLDao;
}

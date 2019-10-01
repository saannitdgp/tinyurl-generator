package com.sandeep.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionUtil {

     @Autowired
     private SessionFactory sessionFactory;

     public  Session getSession(){

         return sessionFactory.getCurrentSession();
     }

}

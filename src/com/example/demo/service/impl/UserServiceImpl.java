package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author by HZL
 * @date 2019/12/4 11:03
 * @description
 */
public class UserServiceImpl implements UserService {

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {

    Session s = sessionFactory.openSession();
    Transaction tx= s.beginTransaction();
    s.save(user);
    tx.commit();
    }
}


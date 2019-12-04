package com.example.demo.test;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author by HZL
 * @date 2019/12/4 11:08
 * @description
 */
public class HibernateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        UserService userService = (UserServiceImpl)applicationContext.getBean("user");
        User user = new User();
        user.setId(3);
        user.setUsername("yan");
        user.setPassword("123456");
        userService.add(user);
    }
}

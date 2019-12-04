package com.example.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @author by HZL
 * @date 2019/12/4 10:15
 * @description
 */
public class SpringTest {
    public static void main(String[] args){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestService testService=(TestService)applicationContext.getBean("testService");
        testService.hello();
    }
}

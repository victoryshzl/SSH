package com.example.demo.test;

/**
 * @author by HZL
 * @date 2019/12/4 10:10
 * @description
 */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello " + getName());
    }
}

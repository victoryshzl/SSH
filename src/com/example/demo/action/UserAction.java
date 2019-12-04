package com.example.demo.action;

import com.example.demo.bean.User;
import com.example.demo.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author by HZL
 * @date 2019/12/4 14:18
 * @description
 */
public class UserAction extends ActionSupport {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Autowired
    private UserServiceImpl userService;

    public String add(){
        User user=new User();
        user.setId(getId());
        user.setUsername(getUsername());
        user.setPassword(getPassword());
        userService.add(user);
        return SUCCESS;
    }
    public void setUserService(UserServiceImpl userService){
        this.userService=userService;
    }
}

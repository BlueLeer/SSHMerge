package com.lee.userlogin.service.impl;

import com.lee.userlogin.domain.User;
import com.lee.userlogin.service.UserServiceInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserServiceTest {

    @Resource(name = "userService")
    private UserServiceInterface mUserServiceInterface;

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("郭小绿");
        user.setPassword("44444");
        Long id = (Long) mUserServiceInterface.addUser(user);
        System.out.println(id);

    }
}
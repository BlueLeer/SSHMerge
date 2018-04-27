package com.lee.userlogin.service;

import com.lee.userlogin.domain.User;

import java.io.Serializable;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
public interface UserServiceInterface {
    Serializable addUser(User user);
}

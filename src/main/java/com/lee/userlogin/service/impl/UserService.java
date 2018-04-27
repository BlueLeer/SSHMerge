package com.lee.userlogin.service.impl;

import com.lee.userlogin.dao.DaoInterface;
import com.lee.userlogin.domain.User;
import com.lee.userlogin.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
@Repository("userService")
public class UserService implements UserServiceInterface {

    private DaoInterface<User> mDaoInterface;

    public DaoInterface<User> getDaoInterface() {
        return mDaoInterface;
    }

    @Autowired
    public void setDaoInterface(DaoInterface<User> daoInterface) {
        mDaoInterface = daoInterface;
    }

    @Override
    public Serializable addUser(User user) {
        return mDaoInterface.add(user);
    }

}

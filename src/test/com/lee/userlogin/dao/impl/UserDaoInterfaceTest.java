package com.lee.userlogin.dao.impl;

import com.lee.userlogin.dao.DaoInterface;
import com.lee.userlogin.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserDaoInterfaceTest {
    @Resource(name = "baseDao")
    private DaoInterface<User> mBaseDao;


    @Test
    public void getTest() {
        String hql = "from User where userId = 1";
        User user = mBaseDao.get(hql);
        System.out.println(user);
    }
}
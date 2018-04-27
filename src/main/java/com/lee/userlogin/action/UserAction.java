package com.lee.userlogin.action;

import com.lee.userlogin.domain.User;
import com.lee.userlogin.service.UserServiceInterface;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
public class UserAction extends BaseAction implements ModelDriven<User> {
    private User mUser = new User();

    @Resource(name = "userService")
    private UserServiceInterface mUserServiceInterface;

    public String register() {
        System.out.println("register......");
        try {

            Long id = (Long) mUserServiceInterface.addUser(mUser);
            System.out.println(id);
        } catch (Exception e) {
            return ERROR;
        }
        getRequest().put("msg", "添加用户成功!");
        return SUCCESS;
    }


    @Override
    public User getModel() {
        return mUser;
    }
}

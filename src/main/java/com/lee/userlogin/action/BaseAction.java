package com.lee.userlogin.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;
import java.util.Map;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */

/**
 * 通过RequestAware,SessionAware,ApplicationAware获取：
 * 在Struts2中不能直接访问Request，Session，Application元素(这三个元素和Web原生的不一样,他们存贮的是一项项键值对)，
 * 但是可以使用Struts2中提供的RequestAware，SessionAware，ApplicationAware。
 * 在这里要分别为三个对象提供setter方法，以便让struts自动执行，
 * 使用IoC（控制反转）进行赋值。
 */
public class BaseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    private Map<String, Object> request;
    private Map<String, Object> session;
    private Map<String, Object> application;


    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.session = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.application = map;
    }
}

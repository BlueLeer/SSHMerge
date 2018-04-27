package com.lee.userlogin.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @CreateAuthor: KingIsHappy
 * @CreateDate: 2018/4/27
 * @Description:
 */
@Entity
@Table(name = "ssh_user") // 对应数据库中的ssm_user表格
public class User {
    private Long userId;
    private String userName;
    private String password;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

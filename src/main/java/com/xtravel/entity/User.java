package com.xtravel.entity;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2021-11-22 20:14:11
 */
@SuppressWarnings("serial")
@ToString
public class User {
    private Integer id;

    private String username;

    private String sex;

    private Date birthday;

    private String address;

    private String password;

    public User(Integer id, String username, String sex, Date birthday, String address, String password) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.password = password;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


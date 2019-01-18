package com.yun.answer_frame.entity;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 12:17
 * @description：微信小程序用户
 * @modified By：
 * @version: 0.0.1$
 */
public class User {
    private String openid;
    private String name;
    private Integer age;
    private String academy;
    private String sex;
    private String classs;

    @Override
    public String toString() {
        return "User{" +
                "openid='" + openid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", academy='" + academy + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}

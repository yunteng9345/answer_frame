package com.yun.answer_frame.entity;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 12:17
 * @description：微信答题框架管理员实体
 * @modified By：
 * @version: 0.0.1$
 */

public class Admin {
    private String a_id;
    private String admin_name;
    private String admin_pd;
    private String academy;
    private Integer is_vip;


    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public Integer getIs_vip() {
        return is_vip;
    }

    public void setIs_vip(Integer is_vip) {
        this.is_vip = is_vip;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_pd() {
        return admin_pd;
    }

    public void setAdmin_pd(String admin_pd) {
        this.admin_pd = admin_pd;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "a_id='" + a_id + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_pd='" + admin_pd + '\'' +
                ", academy='" + academy + '\'' +
                ", is_vip=" + is_vip +
                '}';
    }

}

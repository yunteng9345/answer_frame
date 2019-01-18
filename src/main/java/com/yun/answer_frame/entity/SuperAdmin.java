package com.yun.answer_frame.entity;
/*
超级管理员实体，用来管理一般的管理员及其所有用户
 */
public class SuperAdmin {
    private String id;
    private String pd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "SuperAdmin{" +
                "id='" + id + '\'' +
                ", pd='" + pd + '\'' +
                '}';
    }
}

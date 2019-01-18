package com.yun.answer_frame.service;

import com.yun.answer_frame.entity.Admin;

import java.util.List;

public interface AdminService {
    //添加新管理员
    public Integer addAdmin(Admin admin);
    //删除管理员
    public Integer deleteAdmin(Admin admin);
    //查询所有管理员
    public List<Admin> selectAllAdmin();
    //设置管理员是否为vip
}

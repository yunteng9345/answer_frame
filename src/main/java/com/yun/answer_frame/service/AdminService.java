package com.yun.answer_frame.service;

import com.yun.answer_frame.entity.Admin;

import java.util.List;

public interface AdminService {
    //添加新管理员
     Integer addAdmin(Admin admin);
    //删除管理员
     Integer deleteAdmin(Admin admin);
    //查询所有管理员
     List<Admin> selectAllAdmin();
    //查询管理员总数
    Integer countItem();
}

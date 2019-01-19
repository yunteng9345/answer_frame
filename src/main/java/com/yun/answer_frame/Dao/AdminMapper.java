package com.yun.answer_frame.Dao;

import com.yun.answer_frame.entity.Admin;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    //添加新管理员
    Integer addAdmin(Admin admin);
    //删除管理员
    Integer deleteAdmin(Admin admin);
    //查询所有管理员
    List<Admin> selectAllAdmin();
    //设置管理员是否为vip
    Integer countItem();
}

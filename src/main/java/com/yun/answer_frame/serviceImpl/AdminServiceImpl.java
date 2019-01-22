package com.yun.answer_frame.serviceImpl;

import com.yun.answer_frame.Dao.AdminMapper;
import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Integer countItem() {
        return adminMapper.countItem();
    }

    @Override
    public Admin selectAdminByAid(Admin admin) {
        return adminMapper.selectAdminByAid(admin);
    }

    @Override
    public Integer addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public Integer deleteAdmin(Admin admin) {
        return adminMapper.deleteAdmin(admin);
    }

    @Override
    public List<Admin> selectAllAdmin() {
        return adminMapper.selectAllAdmin();
    }
}

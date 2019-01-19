package com.yun.answer_frame.serviceImpl;

import com.alibaba.druid.sql.ast.expr.SQLCaseStatement;
import com.github.pagehelper.PageHelper;
import com.yun.answer_frame.Dao.AdminMapper;
import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.PageBean;
import com.yun.answer_frame.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findItemByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
               PageHelper.startPage(currentPage, pageSize);
               List<Admin> allItems = adminMapper.selectAllAdmin();       //全部商品
                int countNums = adminMapper.countItem();            //总记录数
                PageBean<Admin> pageData = new PageBean<>(currentPage, pageSize, countNums);
                pageData.setItems(allItems);
                return pageData.getItems();
    }
}

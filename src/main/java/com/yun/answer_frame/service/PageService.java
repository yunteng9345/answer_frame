package com.yun.answer_frame.service;

import com.yun.answer_frame.entity.Admin;

import java.util.List;

public interface PageService {
    List<Admin> findItemByPage(int currentPage, int pageSize);
}

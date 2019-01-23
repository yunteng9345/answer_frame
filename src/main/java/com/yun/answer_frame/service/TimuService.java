package com.yun.answer_frame.service;

import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.entity.TimuItem;

import java.util.List;

public interface TimuService {
    //添加题目
    Integer addTimu(Timu timu);
    //我发布的题目集
    List<Timu> selectAllTimuByAid(Timu timu);
    //查询题目数量
    Integer selectAllTimu();

    /*
    题目
     */
    Integer addTimuItem(TimuItem timuItem);


}

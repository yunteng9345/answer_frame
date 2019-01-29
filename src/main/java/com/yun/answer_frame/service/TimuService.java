package com.yun.answer_frame.service;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
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
    Integer selectAllTimuNum();
    //删除题目
    Integer deleteTimu(Timu timu);
    //发布题目
    Integer publishTimu(Timu timu);
    //查询所有题目集
    List<Timu> selectAllTimu();

    /*
    题目
     */
    //添加题目
    Integer addTimuItem(TimuItem timuItem);

    List<TimuItem> selectAllTimuitemByTid(Timu timu);

}

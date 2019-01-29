package com.yun.answer_frame.Dao;

import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.entity.TimuItem;
import org.springframework.stereotype.Repository;

import java.net.InterfaceAddress;
import java.util.List;

@Repository
public interface TimuMapper {
    Integer addTimu(Timu timu);
    List<Timu> selectAllTimuByAid(Timu timu);
    Integer selectAllTimuNum();
    Integer deleteTimu(Timu timu);
    Integer publishTimu(Timu timu);
    List<Timu> selectAllTimu();



    Integer addTimuItem(TimuItem timuItem);
    List<TimuItem> selectAllTimuitemByTid(Timu timu);
}

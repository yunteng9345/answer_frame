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
/*
使选择的A选项加一
 */
    Integer addSmallItemA(TimuItem timuItem);
    /*
使选择的B选项加一
 */
    Integer addSmallItemB(TimuItem timuItem);
    /*
使选择的C选项加一
 */
    Integer addSmallItemC(TimuItem timuItem);
    /*
使选择的D选项加一
 */
    Integer addSmallItemD(TimuItem timuItem);

    Integer addTimuItem(TimuItem timuItem);
    List<TimuItem> selectAllTimuitemByTid(Timu timu);
}

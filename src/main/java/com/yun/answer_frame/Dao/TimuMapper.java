package com.yun.answer_frame.Dao;

import com.yun.answer_frame.entity.Timu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimuMapper {
    Integer addTimu(Timu timu);
    List<Timu> selectAllTimuByAid(Timu timu);
    Integer selectAllTimu();
}

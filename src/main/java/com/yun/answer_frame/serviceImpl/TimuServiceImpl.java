package com.yun.answer_frame.serviceImpl;

import com.yun.answer_frame.Dao.TimuMapper;
import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.entity.TimuItem;
import com.yun.answer_frame.service.TimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimuServiceImpl  implements TimuService {

    @Autowired
    private TimuMapper timuMapper;

    @Override
    public Integer publishTimu(Timu timu) {
        return timuMapper.publishTimu(timu);
    }

    @Override
    public Integer deleteTimu(Timu timu) {
        return timuMapper.deleteTimu(timu);
    }

    @Override
    public Integer selectAllTimu() {
        return timuMapper.selectAllTimu();
    }

    @Override
    public Integer addTimuItem(TimuItem timuItem) {
        return timuMapper.addTimuItem(timuItem);
    }

    @Override
    public List<Timu> selectAllTimuByAid(Timu timu) {
        return timuMapper.selectAllTimuByAid(timu);
    }

    @Override
    public Integer addTimu(Timu timu) {
        return timuMapper.addTimu(timu);
    }
}

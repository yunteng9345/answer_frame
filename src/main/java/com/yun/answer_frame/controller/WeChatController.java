package com.yun.answer_frame.controller;


import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.serviceImpl.TimuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/*
1.提供题目集显示
2.提供数据收集模板
 */
@Controller("wechat")
@RequestMapping("/wechat")
public class WeChatController {
    @Autowired
    private TimuServiceImpl timuService;


    @RequestMapping("/alltimu")
    @ResponseBody
    public Map<String,Object> alltimu(){

        //System.out.println("执行了这个方法");
        Map resultMap=new HashMap();
        resultMap.put("alltimu",timuService.selectAllTimu());
        resultMap.put("status","success");

        return resultMap;
    }

    @RequestMapping("/alltimuitem")
    @ResponseBody
    public Map<String,Object> alltimuitem(@RequestParam("t_id") String t_id){

        Timu timu =new Timu();
        timu.setT_id(t_id);
       //System.out.println(t_id);
        Map resultMap=new HashMap();
        resultMap.put("alltimuitem",timuService.selectAllTimuitemByTid(timu));
        resultMap.put("status","success");

        return resultMap;
    }

}

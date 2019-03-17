package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.entity.TimuItem;
import com.yun.answer_frame.serviceImpl.TimuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.MalformedObjectNameException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/anaylze")
public class AnalyzeController {

    @Autowired
    private TimuServiceImpl timuService;


    //题目分析页
    @RequestMapping("/index")
    public String analyze(Model model)
    {
        //model.addAttribute("timu",timu);

        return "analyze";
    }

    /**
     * 进入对应的题目集当中
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/read",method = RequestMethod.POST)
    public Map<String, Object> read1(@RequestParam(value = "ids") String ids) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        String[] idsStr = ids.split(",");
        //System.out.println(idsStr[0]);
        Timu timu =new Timu();
        timu.setT_id(idsStr[0]);
        resultMap.put("alltimuitem",timuService.selectAllTimuitemByTid(timu));
        resultMap.put("success", true);

        return resultMap;
        //return "timu_analyze";
    }

    /**
     * 进入对应的题目集当中
     * @param
     * @return
     */
    @RequestMapping(value = "/anaylzeTimuItem")
    public String anaylzeTimuItem(@RequestParam(value = "t_id") String t_id,Model model) {

        System.out.println(t_id);
        Timu timu =new Timu();
        timu.setT_id(t_id);
        model.addAttribute("alltimuitem",timuService.selectAllTimuitemByTid(timu));
        List<TimuItem> timuItems = timuService.selectAllTimuitemByTid(timu);
        for(TimuItem timuItem:timuItems) {
            System.out.println(timuItem.getA_count());
        }
        return "timu_analyze";
    }






}

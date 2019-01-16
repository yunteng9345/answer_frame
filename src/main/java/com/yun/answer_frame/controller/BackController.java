package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.Timu;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 12:17
 * @description：微信答题框架后端控制器
 * @modified By：
 * @version: 0.0.1$
 */
@Controller
@RequestMapping("/back")
public class BackController {


    @RequestMapping("/index")
    public String index(Model model,String name)
    {
        /**
         * create by: 云腾
         * description: 返回主页的视图
         * create time: 2018/12/27 13:49
         * 
         [model, name]
         * @return java.lang.String
         */
        Admin admin=new Admin();
        admin.setAdmin_name("yun");
        admin.setAdmin_pd("123");
        //System.out.println(admin);
        model.addAttribute("admin",admin);
        return "back_index";
    }

    @RequestMapping("/addTimu")
    public String addTimu(Model model)
    {
        /**
         * create by: 云腾
         * description: 返回添加题目集的视图
         * create time: 2018/12/27 13:48
         * 
         [model]

         * @return java.lang.String
         */
        model.addAttribute("timu",new Timu());
        //System.out.println("add tiMU");
        return "back_addTimu";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@ModelAttribute Timu timu,Model model)
    {
        /**
         * create by: 云腾
         * description: 在后台添加题目集的具体内容
         * create time: 2018/12/27 13:49
         *
         [timu]
         * @return java.lang.String
         */

        //生成uuid作为题目集的唯一标识符
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        timu.setT_id(uuid);
        //生成题目的创建时间（当前时间）
        Date date = new Date();
        SimpleDateFormat nowdateformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowtime = nowdateformatter.format(date);
        timu.setT_creat_date(nowtime);
        //
        System.out.println(timu.getT_creat_date());
        model.addAttribute("timu0",new Timu());
        model.addAttribute("timu",timu);
        return "back_addTimuItem";
    }

    @RequestMapping("/addExcelModel")
    public String addExcelModel()
    {
        /**
         * create by: 云腾
         * description: 添加excel的数据收集模板
         * create time: 2018/12/27 18:53
         * 
         []
         * @return java.lang.String
         */

        return  "back_excel";
    }

    public  static void main(String []args){
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        //System.out.println(uuid);
    }

}

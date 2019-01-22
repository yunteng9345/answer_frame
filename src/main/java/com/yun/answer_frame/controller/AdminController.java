package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.SuperAdmin;
import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;
    //返回超级管理员登录页
    @RequestMapping("/index")
    public String index(Model model, String name)
    {
        Admin admin =new Admin();
        //System.out.println(admin);
        model.addAttribute("admin",admin);
        //model.addAttribute("err","用户名或者密码错误！");
        return "admin_login";
    }

    //登录验证
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute Admin admin, Model model)
    {
        //System.out.println(admin.getAdmin_name());
        //System.out.println(admin.getAdmin_pd());
        Admin admin1 =adminService.selectAdminByAid(admin);

        if(admin1!=null)
        {
            model.addAttribute("now_admin",admin1.getAcademy()+"管理员");
            return "back_index";
        }
        //验证失败
        model.addAttribute("admin",admin);
        model.addAttribute("err","用户名或者密码错误！");
        return "admin_login";

    }


    //题目添加页
    @RequestMapping("/timu")
    public String timu(Model model)
    {
        Timu timu =new Timu();
        model.addAttribute("timu",timu);
        return "back_addTimu";
    }
    //题目添加页
    @RequestMapping("/myTimu")
    public String mytimu(Model model)
    {
        Timu timu =new Timu();
        model.addAttribute("timu",timu);
        return "back_myTimuJi";
    }
    //题目分析页
    @RequestMapping("/anaylze")
    public String analyze(Model model)
    {

        //model.addAttribute("timu",timu);
        return "analyze";
    }











}

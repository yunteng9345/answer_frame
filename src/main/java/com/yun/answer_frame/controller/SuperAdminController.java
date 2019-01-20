package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.SuperAdmin;
import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.service.AdminService;
import com.yun.answer_frame.serviceImpl.AdminServiceImpl;
import com.yun.answer_frame.serviceImpl.PageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 12:17
 * @description：控制、查询、管理员
 * @modified By：
 * @version: 0.0.1$
 */
@Controller
@RequestMapping("/superadmin")
public class SuperAdminController {

    @Autowired
    private AdminServiceImpl adminServiceImpl;
    @Autowired
    private PageServiceImpl pageService;


    //返回超级管理员登录页
    @RequestMapping("/index")
    public String index(Model model,String name)
    {
//        Admin admin=new Admin();
////        admin.setAdmin_name("yun");
////        admin.setAdmin_pd("123");
        SuperAdmin superAdmin =new SuperAdmin();

        //System.out.println(admin);
        model.addAttribute("superAdmin",superAdmin);
        //model.addAttribute("err","用户名或者密码错误！");
        return "super_login";
    }
    //登录验证
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute SuperAdmin superAdmin,Model model)
    {
        System.out.println(superAdmin.getId());
        System.out.println(superAdmin.getPd());
        //验证成功
        if(superAdmin.getId().equals("yun")&&superAdmin.getPd().equals("123"))
        {

            return "super_admin";
        }
        //验证失败
        model.addAttribute("superAdmin",superAdmin);
        model.addAttribute("err","用户名或者密码错误！");
        return "super_login";

    }


    /**
     * 4、删除
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> delete() {

        return null;
    }

    /**
     * 3、添加、修改
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/save")
    public Admin save( ) {

        Admin admin=new Admin();
        admin.setAdmin_name("132");
        admin.setAcademy("递四方速递");
        admin.setAdmin_pd("5454");
        admin.setIs_vip("不是");
        adminServiceImpl.addAdmin(admin);


        return admin;
    }

    /**
     * 2、显示
     * @param
     * @param
     * @return
     */

    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> itemsPage(){


        return null;
        //System.out.println(pageService.findItemByPage(currentPage,pageSize));
       // return pageService.findItemByPage(currentPage,pageSize);
    }


    /**
     * 1、进入增删改查界面
     * @return
     */
    @RequestMapping("/crud")
    public String crud() {
        return "crud";
    }





}

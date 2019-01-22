package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.Admin;
import com.yun.answer_frame.entity.SuperAdmin;
import com.yun.answer_frame.entity.Timu;
import com.yun.answer_frame.serviceImpl.AdminServiceImpl;
import com.yun.answer_frame.serviceImpl.TimuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("adminController")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;
    @Autowired
    private TimuServiceImpl timuService;
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
    public String login(@ModelAttribute Admin admin, Model model, HttpServletRequest request)
    {
        //System.out.println(admin.getAdmin_name());
        //System.out.println(admin.getAdmin_pd());
        Admin admin1 =adminService.selectAdminByAid(admin);

        if(admin1!=null)
        {
            HttpSession session=request.getSession();
            session.setAttribute("now_admin",admin1);
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
    public String timu(Model model,HttpServletRequest request)
    {
        //Admin admin =(Admin)request.getSession().getAttribute("now_admin");
        //System.out.println(admin.getAcademy());
        Timu timu =new Timu();
        model.addAttribute("timu",timu);
        return "back_addTimu";
    }




    //题目添加
    @RequestMapping("/addTimu")
    public String addTimu(Timu timu, HttpServletRequest request,Model model)
    {
        Admin admin =(Admin)request.getSession().getAttribute("now_admin");
        //System.out.println(admin.getA_id());
        timu.setA_id(admin.getA_id());
        Date date =new Date();
        timu.setT_creat_date(date);
        timuService.addTimu(timu);
        //model.addAttribute("timu",timu);
        return "back_addTimuItem";
    }



    @RequestMapping("/mTimu")
    public String mTimu(Model model,HttpServletRequest request)
    {
        //Admin admin =(Admin)request.getSession().getAttribute("now_admin");
        //System.out.println(admin.getAcademy());
       // Timu timu =new Timu();
        //model.addAttribute("timu",timu);
        return "back_allTimu";
    }


    //我的题目集
    @RequestMapping("/myTimu")
    @ResponseBody
    public Map<String,Object> mytimu(@RequestParam(value = "page", required = false) Integer page,
                                         @RequestParam(value = "rows", required = false) Integer rows,HttpServletRequest request){

        Timu timu =new Timu();
        Admin admin =(Admin)request.getSession().getAttribute("now_admin");
        timu.setA_id(admin.getA_id());
        int total=timuService.selectAllTimu();
        //System.out.println(total);
        List<Timu>  stuinforlist=timuService.selectAllTimuByAid(timu);
        //System.out.println(stuinforlist);
        Map resultMap=new HashMap();
        resultMap.put("total",total-1);
        resultMap.put("rows",stuinforlist);

        return resultMap;

    }




    //题目分析页
    @RequestMapping("/anaylze")
    public String analyze(Model model)
    {
        //model.addAttribute("timu",timu);
        return "analyze";
    }











}

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
@Controller("superAdminController")
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
//        admin.setAdmin_name("yun");
//        admin.setAdmin_pd("123");
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
        //System.out.println(superAdmin.getId());
       //System.out.println(superAdmin.getPd());
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
     * 删除管理员
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public Map<String, Object> delete(@RequestParam(value = "ids") String ids) {
        //System.out.println("ids的值："+ids);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String[] idsStr = ids.split(",");
        //for (int i = 0; i < ids.length(); i++) {
        for (int i = 0; i < idsStr.length; i++) { // 2018.7.25 根据网友意见做出正确修改
            Admin admin=new Admin();
            admin.setA_id(Integer.parseInt(idsStr[i]));
            adminServiceImpl.deleteAdmin(admin);
            //userDao.delete(Integer.parseInt(idsStr[i]));
        }
        resultMap.put("success", true);

        return resultMap;
    }


    /**
     * 3、添加、修改管理员
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Map<String, Object> save(Admin admin) {
        //System.out.println(admin.getA_id());
        Map<String, Object> resultMap = new HashMap<String, Object>();
        adminServiceImpl.addAdmin(admin);
        resultMap.put("success", true);
        return resultMap;
    }


    /**
     * 2、显示所有管理员
     * @param
     * @param
     * @return
     */

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Object> itemsPage(Admin admin, @RequestParam(value = "page", required = false) Integer page,
                                         @RequestParam(value = "rows", required = false) Integer rows){

       // int page=Integer.parseInt(request.getParameter("page"));
       // int pageSzie=Integer.parseInt(request.getParameter("rows"));//pageSzie
        int startRecord=(page-1)*rows+1;
        int total=adminServiceImpl.countItem();
        List<Admin>  stuinforlist=adminServiceImpl.selectAllAdmin();
        Map resultMap=new HashMap();
        resultMap.put("total",total-1);
        resultMap.put("rows",stuinforlist);
        return resultMap;

//        Map<String, Object> resultMap = new HashMap<String, Object>();
//        resultMap.put("list", );
//        //resultMap.put("total", count);
//        resultMap.put("success", true);
//
//        System.out.println("执行了/list");
//        return resultMap;
        //System.out.println(pageService.findItemByPage(currentPage,pageSize));
       // return pageService.findItemByPage(currentPage,pageSize);
    }


    /**
     * 1、进入增删改查界面
     * @return
     */
//    @RequestMapping("/crud")
//    public String crud() {
//        return "crud";
//    }


}

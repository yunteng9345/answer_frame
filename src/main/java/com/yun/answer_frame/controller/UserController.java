package com.yun.answer_frame.controller;

import com.yun.answer_frame.entity.TimuItem;
import com.yun.answer_frame.serviceImpl.TimuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
1.收集题目信息
2.收集Excel信息
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TimuServiceImpl timuService;

    @ResponseBody
    @RequestMapping("/addSmallItem")
    public Map<String,Object> addSmallItem(HttpServletRequest request)
    {
        String ti_id =request.getParameter("ti_id");
        //System.out.println(ti_id);
        String select =request.getParameter("select");
        //System.out.println(select);
        TimuItem timuItem =new TimuItem();
        timuItem.setTi_id(Integer.parseInt(ti_id));

        switch (select){
            case "a": timuService.addSmallItemA(timuItem);break;
            case "b": timuService.addSmallItemB(timuItem);break;
            case "c": timuService.addSmallItemC(timuItem);break;
            case "d": timuService.addSmallItemD(timuItem);break;
            default:
                break;
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("success", true);

        return resultMap;


    }

}

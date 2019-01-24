package com.yun.answer_frame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anaylze")
public class AnalyzeController {

    //题目分析页
    @RequestMapping("/index")
    public String analyze(Model model)
    {
        //model.addAttribute("timu",timu);
        return "analyze";
    }

}

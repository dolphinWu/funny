package com.mayan.wx.controller;

import com.mayan.wx.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}

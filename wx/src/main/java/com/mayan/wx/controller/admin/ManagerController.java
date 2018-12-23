package com.mayan.wx.controller.admin;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.mayan.wx.Request.user.UserRequest;
import com.mayan.wx.model.user.User;
import com.mayan.wx.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/admin")
public class ManagerController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "admin/index";
    }


    @RequestMapping("/userManager")
    public String userManager(@RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize, @RequestParam(value = "pageNumber",
            defaultValue = "1", required = false) int pageNumber, UserRequest userRequest, Map<String, Object> map) {
        PageInfo<User> userPage = userService.findUserForPage(pageSize, pageNumber, userRequest);
        map.put("userPage", userPage);
        return "admin/userManager";
    }
}

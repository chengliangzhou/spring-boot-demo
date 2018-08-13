package com.sinosoft.analysis.controller;

import com.sinosoft.analysis.domain.entity.User;
import com.sinosoft.analysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService modelInfoService;

    @RequestMapping("/list")
    public String index(Model model){
        User user = modelInfoService.findById(1);
        model.addAttribute("user", user);
        return "/user/userList";
    }

}

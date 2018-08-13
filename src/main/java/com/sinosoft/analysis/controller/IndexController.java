package com.sinosoft.analysis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //从配置文件直接获取值
    @Value("${server.address}")
    private String serverName;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String index(){
        return "/home";
    }

    @RequestMapping("/server")
    public String host(Model model) {
        model.addAttribute("serverName", serverName);
        model.addAttribute("port", port);
        return "/serverInfo";
    }

}

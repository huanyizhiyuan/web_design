package com.example.springboot_project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Huanyizhiyuan
 * @description controller层hello业务
 * @date 2024/12/22 21:19
 */

@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    @RequestMapping(value = "/index")
    public String test(){
        return "index";
    }
}
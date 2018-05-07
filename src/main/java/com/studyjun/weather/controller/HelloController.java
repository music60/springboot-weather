package com.studyjun.weather.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/say")
    public String say(Model model){
        model.addAttribute("name","hello");
        return "index";
    }


}

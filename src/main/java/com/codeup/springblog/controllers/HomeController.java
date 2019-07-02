package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
//    @GetMapping("/")
//    public String home() {
//        return "This is the landing page!";
//    }

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("username", "Bjork");
        return "home";
    }
}

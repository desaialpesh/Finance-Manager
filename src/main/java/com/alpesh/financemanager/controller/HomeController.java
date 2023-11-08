package com.alpesh.financemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex (Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("total", 26500);
        model.addAttribute("cardname", "SBI");
        return "index";
    }
}

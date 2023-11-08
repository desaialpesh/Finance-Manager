package com.alpesh.financemanager.controller;

import com.alpesh.financemanager.Cards;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThemePagesController {

    @RequestMapping("/")
    public String getIndex (Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("total", 26500);
        model.addAttribute("cardname", "SBI");
        model.addAttribute("card",new Cards(
                1,
                "RuPay"
                ,"ICICI"
        ));
        return "index";
    }
}

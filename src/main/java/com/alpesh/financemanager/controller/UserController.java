package com.alpesh.financemanager.controller;

import com.alpesh.financemanager.Cards;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/dashboard")
    public String getDashboard (Model model) {
        List<Cards> cardsList = new ArrayList<>();
        cardsList.add(new Cards(1, "RuPay", "ICICI"));
        cardsList.add(new Cards(2, "Visa", "HDFC"));
        cardsList.add(new Cards(3, "RuPay", "HDFC"));
        cardsList.add(new Cards(4, "Visa", "Kotak Bank"));
        model.addAttribute("cards", cardsList);
        model.addAttribute("title","Dashboard");
        return "dashboard/dashboard";
    }
}

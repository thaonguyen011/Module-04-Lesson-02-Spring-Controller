package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Arrays;
import java.util.List;

@Controller
public class SandwichController {

    @GetMapping("/home")
    public String show() {
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiments, Model model) {
//        List<String> condimentList = Arrays.asList(condiments);
//        model.addAttribute("condiments", condimentList);
        model.addAttribute("condiments", condiments);
        return "condiment";

    }
}

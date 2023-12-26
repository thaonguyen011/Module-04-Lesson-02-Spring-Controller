package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {
    private static String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;

    public EmailController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }


    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, ModelMap modelMap) {
        boolean isValid = validate(email);
        if (isValid) {
            modelMap.addAttribute("email", email);
            return "success";
        } else {
            modelMap.addAttribute("message", "Email is invalid");
            return "home";
        }
    }

    private boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

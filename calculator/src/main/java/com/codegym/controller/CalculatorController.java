package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showCalculator() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("firstOperand") int number1,
                            @RequestParam("secOperand") int number2,
                            @RequestParam("submitButton") String operation,
                            Model model) {
        int result = 0;
        switch (operation) {
            case "Addition":
                result = number1 + number2;
                break;
            case "Subtraction":
                result = number1 - number2;
                break;
            case "Multiple":
                result = number1 * number2;
                break;
            case "Division":
                result = number1 / number2;
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}

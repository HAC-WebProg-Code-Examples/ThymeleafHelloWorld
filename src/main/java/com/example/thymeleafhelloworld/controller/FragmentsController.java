package com.example.thymeleafhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentsController {

    @GetMapping("/modular-page")
    public String getModularPage(Model model) {
        model.addAttribute("name", "Motti");
        return "modular-page";
    }
}

package com.example.thymeleafhelloworld.controller;

import com.example.thymeleafhelloworld.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/personal")
    public String postPersonalGreeting(Model model) {
        Person person = new Person();
        person.setFirstName("Bill");
        person.setLastName("Gates");
        person.setAge(66);
        model.addAttribute("person", person);
        return "personal";
    }
}

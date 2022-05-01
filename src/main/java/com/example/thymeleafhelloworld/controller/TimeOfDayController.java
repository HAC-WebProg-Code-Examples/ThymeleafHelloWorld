package com.example.thymeleafhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalTime;

@Controller
public class TimeOfDayController {

    @GetMapping("/tod")
    public String getTimedGreeting(Model model) {
        LocalTime now = LocalTime.now();
        String greeting;
        if (now.isAfter(LocalTime.MIDNIGHT) && now.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning!";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            greeting = "Good Afternoon!";
        } else if (now.isBefore(LocalTime.of(22, 0))) {
            greeting = "Good Evening!";
        } else {
            greeting = "Good Night!";
        }
        model.addAttribute("greeting", greeting);
        return "tod";
    }

    @GetMapping("/sim_tod/{tod}")
    public String getSimulatedTimedGreeting(@PathVariable String tod, Model model) {
        String greeting;
        switch (tod) {
            case "morning":
                greeting = "Good Morning!";
                break;
            case "afternoon":
                greeting = "Good Afternoon!";
                break;
            case "evening":
                greeting = "Good Evening!";
                break;
            case "night":
                greeting = "Good Night!";
                break;
            default:
                greeting = tod + " is not a valid time of day, you must be tired. Perhaps take a nap?";
        }
        model.addAttribute("greeting", greeting);
        return "tod";
    }
}

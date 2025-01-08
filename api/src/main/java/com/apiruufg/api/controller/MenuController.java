package com.apiruufg.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @GetMapping("/today")
    public String todayMeals() {
        return "Today meals!";
    }

    @GetMapping("/today")
    public String specificTodayMeal(@RequestParam("time") String time) {
        return "Meal at time " + time;
    }

    @GetMapping("/week")
    public String weekMeals() {
        return "Week meals!";
    }

    @GetMapping("date")
    public String specificDateMeals(@RequestParam("date") String date) {
        return "Meals at date: " + date;
    }
}

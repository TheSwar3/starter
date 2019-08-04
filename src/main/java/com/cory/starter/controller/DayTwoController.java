package com.cory.starter.controller;

import com.cory.starter.service.DayTwoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DayTwoController {

    @Autowired
    private DayTwoService dayTwoService;

    @GetMapping("/api/content")
    public String getContent() {
        return dayTwoService.getContent();
    }
}

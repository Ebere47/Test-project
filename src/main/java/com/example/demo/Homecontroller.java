package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping
    public String index() {
        String viewName = getviewName ();
        return "viewName";
    }

    private String getviewName() {
        return "index";
    }
}
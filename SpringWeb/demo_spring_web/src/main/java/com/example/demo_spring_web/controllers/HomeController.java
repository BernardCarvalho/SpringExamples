package com.example.demo_spring_web.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public ModelAndView getHomePage(ModelMap model){
        return new ModelAndView("teste", model);
    }
}

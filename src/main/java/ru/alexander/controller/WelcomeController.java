package ru.alexander.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class WelcomeController {


    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Alexander");
        return "welcome";
    }



}

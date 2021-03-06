package com.zrkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        String message = "Hello Spring MVC";
        return new ModelAndView("index", "message", message);
    }
}

package com.theironyard.controllers;//Created by KevinBozic on 3/14/16.

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;

@Controller
public class CalenderSpringController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "home";
    }
}

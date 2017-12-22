package com.rob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by robinmathur on 03/08/16.
 */
@Controller
public class FrontController {

    @RequestMapping("/home")
     public String home(){
         return "home";
     }

    @RequestMapping("/form")
    public String form(){
        return "home :: form";
    }


}

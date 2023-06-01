package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class SandwichController {
    @GetMapping("/choice")
    String getIndex(){
        return "/index";
    }
    @PostMapping("/condiments")
    String SandwichCondiments(@RequestParam("condiments") String condiments, Model model){
        if (condiments == ""){
            model.addAttribute("message", "Please spice up the sandwich");
            return "/index";

        }
        model.addAttribute("condiments", condiments);
        return "success";
    }
}

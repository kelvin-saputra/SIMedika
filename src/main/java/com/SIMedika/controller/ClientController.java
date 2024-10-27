package com.SIMedika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClientController {
    @GetMapping("/")
    public String showHomePage() {
        return "index.html";
    }

    @PostMapping("/home")
    public String showHomePage(@RequestParam int id) {return "index.html";}
}

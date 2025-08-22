package com.example.jsf_springboot_helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/index.xhtml";
    }

    @GetMapping("/index")
    public String index() {
        return "forward:/index.xhtml";
    }
}
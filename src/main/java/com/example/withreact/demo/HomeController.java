package com.example.withreact.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(path = "/")
    public String index() {
        //  the name of the template, which Spring Boot’s 
        // autoconfigured view resolver will map to 
        // src/main/resources/templates/index.html
        return "index";
    }
}

package com.iamshingie.AzureActiveDirectoryAunthenticationAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/home")
    public String home(){
        return "Hello from login";
    }

}

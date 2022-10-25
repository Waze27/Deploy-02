package com.deploy.deploy_02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @GetMapping("")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }
}

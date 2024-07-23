package com.adg.demoproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping
    public String earth() {
        return "Hello Earthlings!";
    }

    @GetMapping("/mars")
    public String mars() {
        return "Hello Martians!";
    }


}

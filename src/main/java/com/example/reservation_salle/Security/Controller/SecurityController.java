package com.example.reservation_salle.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SecurityController {
    @GetMapping("/login")
    public String login(){

        return "ListeSalle";
    }
}

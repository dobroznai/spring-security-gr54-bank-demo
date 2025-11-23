package de.ait.training.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/users")
    public List<String> getUsers() {
        return List.of("user", "admin");
    }

    @GetMapping("/stats")
    public String stats() {
        return "Bank statistics: active accounts = 4500";
    }

}
package de.ait.training.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @GetMapping("/balance")
    public String balance(Authentication authentication) {
        String username = authentication.getName();
        return "Current balance for " + username + " is 1500 EUR";
    }

    @GetMapping("/transactions")
    public List<String> transactions(Authentication authentication) {
        String username = authentication.getName();
        return List.of("Payment -50 EUR to Amazon","Salary + 2000 EUR ");
    }

}
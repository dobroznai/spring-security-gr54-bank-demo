package de.ait.training.controller;

import de.ait.training.service.ManagerService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {

    // 1) Простой приветственный эндпоинт
    // GET /api/manager/hello
    @GetMapping("/hello")
    public String hello(Authentication authentication) {
        // использовать authentication.getName()
        String username = authentication.getName();
        // "Здравствуйте, менеджер <username>!"
        return "Здравствуйте, менеджер " + username;
    }

    // 2) Эндпоинт с "отчётом" менеджера
    // GET /api/manager/report
    @GetMapping("/report")
    public String report() {
        // вернуть любую строку, типа:
        // "Менеджерский отчёт: сегодня обработано 42 обращения клиентов."
        return "Менеджерский отчёт: сегодня обработано 42 обращения клиентов.";

    }

    @GetMapping("/secret")
    public String secret() {
        return ManagerService.getSecretManagerData();
    }
}


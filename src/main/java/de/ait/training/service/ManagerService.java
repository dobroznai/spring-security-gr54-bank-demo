package de.ait.training.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @PreAuthorize("hasRole('MANAGER')")
    public static String getSecretManagerData() {
        return "Секретные данные только для менеджеров";
    }
}


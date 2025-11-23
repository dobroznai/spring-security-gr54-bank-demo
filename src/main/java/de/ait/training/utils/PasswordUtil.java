package de.ait.training.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtil {
    public static void main(String[] args) {
        String hash = generateBCryptPassword("manager");
        System.out.println(hash);

    }

    public static String generateBCryptPassword(String rowPassword) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(rowPassword);
    }
}

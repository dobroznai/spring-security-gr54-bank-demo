package de.ait.training.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BankSecurityRestIT {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    private TestRestTemplate withAuth(String username, String password) {
        return restTemplate.withBasicAuth(username, password);
    }

//    @Test
//    @DisplayName("Публичный API доступ без авторизации")
//    void testPublicApiAccessWithoutAuth() throws Exception {
//        ResponseEntity<String> response =
//                restTemplate.getForEntity(url("api/public/info"), String.class);
//        assertThat (response.getStatusCode().isEqualTo());
    }




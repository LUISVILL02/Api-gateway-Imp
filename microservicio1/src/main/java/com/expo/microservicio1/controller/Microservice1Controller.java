package com.expo.microservicio1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/microservicio1")
public class Microservice1Controller {

    @GetMapping
    public ResponseEntity<String> getMicroservice2() {
        return ResponseEntity.ok("Hello from Microservice 1");
    }
}

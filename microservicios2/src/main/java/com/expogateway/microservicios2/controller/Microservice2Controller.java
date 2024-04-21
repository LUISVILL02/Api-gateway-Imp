package com.expogateway.microservicios2.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/microservicio2")
public class Microservice2Controller {

    @GetMapping
    public ResponseEntity<String> getMicroservice1() {
        return ResponseEntity.ok("Hello from Microservice 2");
    }
}

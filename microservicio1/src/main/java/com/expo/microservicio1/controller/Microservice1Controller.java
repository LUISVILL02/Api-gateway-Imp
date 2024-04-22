package com.expo.microservicio1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/microservicio1")
public class Microservice1Controller {

    @GetMapping
    public ResponseEntity<String> getMicroservice2() {
        return ResponseEntity.ok("Hello from Microservice 1");
    }

    @PostMapping("/post")
    public ResponseEntity<String> postMicroservice2(@RequestBody Object algo) {
        return ResponseEntity.ok("Hello " + algo.toString() + " from Microservice 1");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> getMicroservice2(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name + " from Microservice 1");
    }

    @GetMapping("/param")
    public ResponseEntity<String> getMicroservice2Param(@RequestParam String name) {
        return ResponseEntity.ok("Hello " + name + " from Microservice 1");
    }
}

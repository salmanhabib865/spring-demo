package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Base path for all endpoints in this controller
public class DemoController {

    @GetMapping("/rooms")  // Full path will be /api/rooms
    public ResponseEntity<?> getAllRooms() {
    	return ResponseEntity.ok("Success");
        // Your implementation
    }
}

package com.javasimple.controller;

import com.javasimple.dto.RequestDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/api/endpoint")
    public ResponseEntity<String> handleRequest(@Valid @RequestBody RequestDto requestDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Handle validation errors
            return ResponseEntity.badRequest().body("Validation errors occurred: " + bindingResult.getFieldErrors().toString());
        }

        // Process the request
        return ResponseEntity.ok("Request processed successfully");
    }
}

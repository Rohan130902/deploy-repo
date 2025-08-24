package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.security.JwtUtil;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    
    private JwtUtil jwtUtil;
    public AuthController(JwtUtil jwtUtil) {
    	this.jwtUtil=jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String username) {
        // ✅ in real app, validate user from DB
        String token = jwtUtil.generateToken(username);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
   
}

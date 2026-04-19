package com.learndevops.demoapp.controller;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {
    
    @Value("${app.version:1.0.2}")
    private String version;

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return "Hello" + name;
    }
    
    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        return response;
    }
    
    @GetMapping("/info")
    public Map<String, String> info() throws Exception {
        Map<String, String> response = new HashMap<>();
        response.put("service", "java-devops-app");
        response.put("version", version);
        response.put("host", InetAddress.getLocalHost().getHostName());
        return response;
    }

    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> payload) {
        Map<String, Object> response = new HashMap<>();
        response.put("received", payload);
        return response;
    }
}

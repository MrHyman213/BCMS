package org.hyman.BCMS.controller;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.auth.JwtRequest;
import org.hyman.BCMS.security.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest request){
        return service.createAuthToken(request);
    }

    @GetMapping("/test")
    public String test(){
        return "Running...";
    }
}

package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.JwtRequest;
import com.springboot.dto.JwtResponse;
import com.springboot.helper.JwtUtil;
import com.springboot.security.CustomUserDetailService;


@RestController
public class JwtController {

    
    @Autowired
    private CustomUserDetailService userDetailService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) {
        System.out.println(jwtRequest);
        try {
            this.authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));

        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Credentials");
        }

        UserDetails userDetails = this.userDetailService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtil.generateToken(userDetails);
        JwtResponse jwtResponse = new JwtResponse(token);
        System.out.println(token);
        return ResponseEntity.ok(jwtResponse);
    }
    
}

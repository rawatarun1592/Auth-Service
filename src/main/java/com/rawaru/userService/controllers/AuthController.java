package com.rawaru.userService.controllers;

import com.rawaru.userService.dtos.LoginResponseDto;
import com.rawaru.userService.dtos.SignUpRequestDto;
import com.rawaru.userService.dtos.SignUpResponseDto;
import com.rawaru.userService.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class AuthController {

    @PostMapping("/sign_up")
    public ResponseEntity<SignUpResponseDto> signUp(@RequestBody SignUpRequestDto signUpRequestDto) {
       return null;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody SignUpRequestDto signUpRequestDto) {
        return null;
    }
}

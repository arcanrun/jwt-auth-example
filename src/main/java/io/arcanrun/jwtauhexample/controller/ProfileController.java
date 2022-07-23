package io.arcanrun.jwtauhexample.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @GetMapping
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/profile")
    public String getProfile(Authentication authentication) {
        return authentication.getName();
    }

    @GetMapping("/admin")
    public String getAdminResource() {
        return "This info available only for admin";
    }
}

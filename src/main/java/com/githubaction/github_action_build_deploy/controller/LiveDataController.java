package com.githubaction.github_action_build_deploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LiveDataController {

    @GetMapping("/live-data")
    public String getLiveData() {
        return "Hello,Irshad";
    }
}
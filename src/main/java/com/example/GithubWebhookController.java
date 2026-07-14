package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GithubWebhookController {

    @PostMapping("/github-webhook")
    public ResponseEntity<String> githubWebhook(@RequestBody String payload) {

        System.out.println("GitHub webhook received:");
        System.out.println(payload);

        return ResponseEntity.ok("Webhook received");
    }
}
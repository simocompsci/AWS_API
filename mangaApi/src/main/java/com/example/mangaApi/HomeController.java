package com.example.mangaApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Visit /swagger-ui.html endpoint to interact with our API and test it.";
    }
}

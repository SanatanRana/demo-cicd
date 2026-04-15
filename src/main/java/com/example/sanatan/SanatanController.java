package com.example.sanatan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SanatanController {

    @GetMapping("/hi")
    public String hi() {
        return "Hi!";
    }
}

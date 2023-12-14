package com.example.productserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServerController {
    @GetMapping("/products")
    public String getMessage() {
        return "A brand new product";
    }
}
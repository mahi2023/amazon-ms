package com.example.amazonms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class girlscloth {
    @GetMapping("/girlscloth")
    public String getData(){
        return "jeans and tshirt available";
    }
}

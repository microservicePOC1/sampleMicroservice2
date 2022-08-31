package com.co.services.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    MathContext m = new MathContext(5);
    
    private BigDecimal initValue(Double val) {
        return new BigDecimal(val).round(m);
    }
    
    @GetMapping("/")
    public String sampleApi() {

        return "Hello Sample Microservice 2";
    }
    
}

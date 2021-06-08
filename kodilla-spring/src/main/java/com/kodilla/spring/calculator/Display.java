package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {

//    @Autowired
    void displayValue(double val) {
        System.out.println(val);
    }
}

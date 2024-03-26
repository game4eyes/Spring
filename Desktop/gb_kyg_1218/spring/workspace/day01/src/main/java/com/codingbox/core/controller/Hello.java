package com.codingbox.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

        @GetMapping
        public String test(){
            return "Hello World";
        }
}

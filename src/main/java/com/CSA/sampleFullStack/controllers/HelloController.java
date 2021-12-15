/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CSA.sampleFullStack.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Francis Fundal
 */
@RestController
@RequestMapping("/api/v1")
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Francis qtieee / Spring Boot!";
    }
}

package com.example.demo.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
/**
 * Handles HTTP GET requests to the root URL ("/").
 * 
 * @return A string "hello world!" as the response.
 */
  @GetMapping("/")
  public String hello() {
    return "hello world!";
  }
}
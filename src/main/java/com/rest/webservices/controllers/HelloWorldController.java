package com.rest.webservices.controllers;

import com.rest.webservices.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("restful-services")
public class HelloWorldController {

    @GetMapping("/helloWorld/{userName}")
    public ResponseEntity<User> helloWorld(@PathVariable String userName) {
        log.info("Inside Hello World");
        User user = User.builder().userName(userName).build();
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}

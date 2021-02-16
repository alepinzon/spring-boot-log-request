package com.example.controllers;


import com.example.domain.HelloWorldRequest;
import com.example.domain.HelloWorldResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class FooController {

    @GetMapping(path = "/hello")
    public HelloWorldResource getHelloWorld() {
        return new HelloWorldResource("Hola", "mundo");
    }

    @PostMapping(path = "/hello", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public HelloWorldResource createHelloWorld(@RequestBody HelloWorldRequest request) {
        return new HelloWorldResource(request.getHello(), request.getWorld());
    }

    @PutMapping(path = "/hello", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public HelloWorldResource updateHelloWorld(@RequestBody HelloWorldRequest request) {
        return new HelloWorldResource(request.getHello(), request.getWorld());
    }

    @PostMapping(path = "/exception")
    public String exception(@RequestBody HelloWorldRequest request) {
        final String hello = request.getHello();
        final String world = request.getWorld();
        throw new IndexOutOfBoundsException();
    }
}
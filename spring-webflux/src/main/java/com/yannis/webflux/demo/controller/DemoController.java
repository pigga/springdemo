package com.yannis.webflux.demo.controller;

import com.yannis.webflux.demo.domain.User;
import com.yannis.webflux.demo.handler.UserHandler;
import com.yannis.webflux.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class DemoController {

    @Autowired
    private UserHandler userHandler;

    public DemoController(UserHandler userHandler){
        this.userHandler = userHandler;
    }

    @PostMapping("/user/saveUser")
    @ResponseBody
    public Mono<User> saveUser(User user){
        return userHandler.saveUser(user);
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public Mono<User> findUserById(@PathVariable String id){
        return userHandler.findUserById(Integer.parseInt(id));
    }

    @GetMapping("/user/findAll")
    @ResponseBody
    public Flux<User> findAllUser(){
        return userHandler.findAll();
    }
}

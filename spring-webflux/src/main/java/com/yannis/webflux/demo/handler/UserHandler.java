package com.yannis.webflux.demo.handler;

import com.yannis.webflux.demo.domain.User;
import com.yannis.webflux.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    private final UserRepository userRepo;

    @Autowired
    UserHandler(UserRepository userRepository){
        this.userRepo = userRepository;
    }

    public Mono<User> saveUser(User user) {
        return Mono.create(userMonoSink -> userMonoSink.success(userRepo.saveUser(user)));
    }

    public Mono<User> findUserById(Integer id){
        return Mono.justOrEmpty(userRepo.getUserById(id));
    }

    public Flux<User> findAll(){
        return userRepo.findAll();
    }
}

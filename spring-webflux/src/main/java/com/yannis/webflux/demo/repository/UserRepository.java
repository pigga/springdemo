package com.yannis.webflux.demo.repository;

import com.yannis.webflux.demo.domain.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;

@Repository
public class UserRepository {
    public final ConcurrentMap<Integer, User> userMap = new ConcurrentHashMap();
    private static final AtomicInteger idGen = new AtomicInteger(0);

    public User saveUser(User user){
        Integer id = idGen.incrementAndGet();
        user.setId(id);
        userMap.put(id, user);
        return user;
    }

    public User getUserById(Integer id){
        return userMap.get(id);
    }

    public Flux<User> findAll() {
        return Flux.fromIterable(userMap.values());
    }
}

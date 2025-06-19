package com.restapi.RestApi.service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.restapi.RestApi.model.User;

@Service
public class UserService {
    private final Map<UUID, User> userStore = new ConcurrentHashMap<>();

    public User createUser(String name, String email) {
        UUID id = UUID.randomUUID();
        User user = new User(id, name, email);
        userStore.put(id, user);
        return user;
    }

    public User getUserById(UUID id) {
        return userStore.get(id);
    }
}


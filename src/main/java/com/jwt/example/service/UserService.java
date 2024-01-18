package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Shaheer", "test@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Saif", "test12@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Asher", "test1234@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Athar", "test56756@gmail.com"));
    }

    public List<User> getUser(){
        return store;
    }
}

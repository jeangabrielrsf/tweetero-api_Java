package com.tweetero.tweeteroapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.tweeteroapi.models.Users;
import com.tweetero.tweeteroapi.repositories.UsersRepository;

@Service
public class UsersService {
    
    @Autowired
    private UsersRepository usersRepository;

    public void create(Users data) {
        usersRepository.save(data);
    }

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    public List<Users> findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }
}

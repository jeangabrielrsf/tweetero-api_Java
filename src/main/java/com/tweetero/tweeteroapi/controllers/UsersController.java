package com.tweetero.tweeteroapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tweetero.tweeteroapi.dto.UserDTO;
import com.tweetero.tweeteroapi.models.Users;
import com.tweetero.tweeteroapi.services.UsersService;

import jakarta.validation.Valid;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;
    
    @PostMapping("/sign-up")
    @ResponseStatus(value = HttpStatus.CREATED)
    public String signUp(@RequestBody @Valid UserDTO req) {
        List<Users> user = service.findByUsername(req.username());
        if (!user.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        } 
        service.create(new Users(req));
        return "OK";
    }

    @GetMapping("/users")
    public List<Users> findAll() {
        return service.findAll();
    }
}

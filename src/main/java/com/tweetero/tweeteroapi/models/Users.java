package com.tweetero.tweeteroapi.models;

import com.tweetero.tweeteroapi.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor


public class Users {
    public Users (UserDTO req) {
        this.username = req.username();
        this.avatar = req.avatar();
    }   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (length = 50, nullable = false)
    private String username;

    @Column (nullable = false)
    private String avatar;
}

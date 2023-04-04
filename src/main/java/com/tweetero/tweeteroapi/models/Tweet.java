package com.tweetero.tweeteroapi.models;

import com.tweetero.tweeteroapi.dto.TweetDTO;

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

public class Tweet {
    public Tweet(TweetDTO req) {
        this.tweet = req.tweet();
        this.username = req.username();
    } 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String username;

    @Column(length = 140, nullable = false)
    private String tweet;
}

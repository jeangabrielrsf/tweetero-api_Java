package com.tweetero.tweeteroapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.tweeteroapi.dto.TweetDTO;
import com.tweetero.tweeteroapi.models.Tweet;
import com.tweetero.tweeteroapi.services.TweetsService;

@RestController
public class TweetsController {

    @Autowired
    private TweetsService tweetsService;

    @PostMapping("/tweets")
    @ResponseStatus(value = HttpStatus.CREATED)
    public String signUp(@RequestBody TweetDTO req) {
        tweetsService.create(new Tweet(req));
        return "OK";
    }

    @GetMapping("/tweets")
    public List<Tweet> listAll() {
        return tweetsService.list();
    }

    @GetMapping("/tweets/{username}")
    public List<Tweet> listUserTweets(@PathVariable String username) {
        return tweetsService.listUserTweets(username);
    }
}

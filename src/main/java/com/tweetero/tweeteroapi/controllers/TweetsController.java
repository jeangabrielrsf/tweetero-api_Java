package com.tweetero.tweeteroapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.tweeteroapi.dto.TweetDTO;

@RestController
public class TweetsController {
    @RequestMapping("/tweets")

    @PostMapping
    public String signUp(@RequestBody TweetDTO req) {
        System.out.println(req);
        return "OK";
    }
}

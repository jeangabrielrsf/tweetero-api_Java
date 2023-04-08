package com.tweetero.tweeteroapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.tweeteroapi.models.Tweet;
import com.tweetero.tweeteroapi.repositories.TweetsRepository;

@Service
public class TweetsService {

    @Autowired
    private TweetsRepository tweetsRepository;

    public void create(Tweet data){
        tweetsRepository.save(data);
    }

    public List<Tweet> list(){
        return tweetsRepository.findAll();
    }
    
}

package com.tweetero.tweeteroapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetero.tweeteroapi.models.Tweet;

@Repository
public interface TweetsRepository extends JpaRepository<Tweet, Long> {
    
}

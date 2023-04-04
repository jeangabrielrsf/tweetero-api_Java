package com.tweetero.tweeteroapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TweetDTO(
    @NotBlank String username, 
    @NotBlank @Size(min = 1, max = 140) String tweet) {
    
}

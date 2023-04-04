package com.tweetero.tweeteroapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserDTO(
    @NotBlank String username,
    @NotBlank @Pattern(regexp = "(http(s?):/)(/[^/]+)+" + ".(?:jpg|gif|png)") String avatar
) {
    
}

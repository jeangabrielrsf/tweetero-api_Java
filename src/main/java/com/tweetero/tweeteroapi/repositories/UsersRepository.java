package com.tweetero.tweeteroapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweetero.tweeteroapi.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findByUsername(String username);
}

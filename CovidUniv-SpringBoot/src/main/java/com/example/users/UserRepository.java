package com.example.users;

import com.example.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// test
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

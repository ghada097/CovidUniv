package com.example.users;

import com.example.users.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersMsApplicationTests {

    @Autowired
    UserRepository userRep;

    @Test
    void contextLoads() {
    }

    @Test
    void testUsername () {
        User u = userRep.findByUsername(("admin"));
        System.out.println(u);
    }

}

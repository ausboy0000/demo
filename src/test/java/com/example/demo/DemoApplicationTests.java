package com.example.demo;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        User u = new User("chen");
        u.setName("tony00");
        String name =u.getName();
    }

    public static void main(String[] args) {

    }

}

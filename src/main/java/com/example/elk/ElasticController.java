package com.example.elk;

import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@RestController
@RequestMapping("/elas")
public class ElasticController {
    private final UserRepo userRepo;

    ElasticController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public String post(@RequestBody User user) {

            userRepo.save(user);

            System.out.println("Received the user: " + user.getName());
            return "hello " + user.getName();

    }
    @GetMapping
    public String get() {
        Page<User> userPage = userRepo.findAll(PageRequest.of(0, 10));

        System.out.println("Testing the database with GET requests");

        userPage.getContent().forEach(u -> {
            System.out.println(u.getName());
        });

        return "Everything should be working!";
    }

}

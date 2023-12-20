package com.example.elk;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elas")
public class ElasticController {
private UserRepo userRepo;

ElasticController(UserRepo userRepo){
    this.userRepo=userRepo;
}

    @PostMapping
    public String post(@RequestBody User user){
        userRepo.save(user);
        System.out.println("received the user " + user.name);
        return "hello";
    }
}

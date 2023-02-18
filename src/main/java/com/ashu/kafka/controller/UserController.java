package com.ashu.kafka.controller;

import com.ashu.kafka.service.UserProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserController {

    @Autowired
    private UserProducerService userProducerService;

    @PostMapping("/ashuData/{name}/{age}")
    public void sendUserData(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        userProducerService.sendUserData(name, age);
    }
}

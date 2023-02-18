package com.ashu.kafka.controller;

import com.ashu.kafka.dto.User;
import com.ashu.kafka.service.UserProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/userapi")
public class UserController {

    @Autowired
    private UserProducerService userProducerService;

//    @PostMapping("/ashuData/{name}/{age}")
//    public void sendUserData(@PathVariable("name") String name, @PathVariable("age") Integer age) {
//        userProducerService.sendUserData(name, age);
//    }

    @PostMapping("/ashuData")
    public void sendUserData(@RequestBody User user) {
        userProducerService.sendUserData(user);
    }
}

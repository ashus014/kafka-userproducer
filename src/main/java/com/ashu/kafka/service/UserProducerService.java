package com.ashu.kafka.service;

import com.ashu.kafka.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducerService {

    @Autowired
//    private KafkaTemplate<String, Integer> kafkaTemplate;
    private KafkaTemplate<String, User> kafkaTemplate;

//    public void sendUserData(String name, Integer age) {
    public void sendUserData(User user) {
        kafkaTemplate.send("user-topic", user.getName(), user);
    }
}

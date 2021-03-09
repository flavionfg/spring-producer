package com.example.demo.spring.producer.service;

import com.example.demo.spring.producer.dto.Message;

public interface AmqpService {

    void sentToConsumer(Message message);

}

package com.example.demo.spring.producer.service.implementation;

import com.example.demo.spring.producer.amqp.AmqpProducer;
import com.example.demo.spring.producer.dto.Message;
import com.example.demo.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sentToConsumer(Message message) {
        amqp.producer(message);
    }


}

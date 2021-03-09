package com.example.demo.spring.producer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);

}

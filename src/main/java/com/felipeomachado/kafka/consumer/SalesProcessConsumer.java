package com.felipeomachado.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SalesProcessConsumer {

    @KafkaListener(topics = "sales", groupId = "test-consumer-group")
    public void consume1(String message) {
        System.out.println("==================================== consume1= " + message);
    }

    @KafkaListener(topics = "sales", groupId = "test-consumer-group")
    public void consume2(String message) {
        System.out.println("==================================== consume2= " + message);
    }

    @KafkaListener(topics = "sales", groupId = "test-consumer-group")
    public void consume3(String message) {
        System.out.println("==================================== consume3= " + message);
    }

    @KafkaListener(topics = "sales", groupId = "test-consumer-group")
    public void consume4(String message) {
        System.out.println("==================================== consume4= " + message);
    }


}

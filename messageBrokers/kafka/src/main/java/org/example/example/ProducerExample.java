package org.example.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.example.demo.Producer;

public class ProducerExample {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.outputToInfo();
        producer.outputToDebug();
        KafkaProducer<String, String> kafkaProducer;
    }
}
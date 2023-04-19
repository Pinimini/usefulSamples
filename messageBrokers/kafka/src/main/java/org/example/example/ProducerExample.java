package org.example.example;

import org.example.demo.Producer;

public class ProducerExample {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.outputToInfo();
        producer.outputToDebug();
    }
}
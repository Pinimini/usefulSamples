package org.example.creational.builder.demo;

public class Demo {
    public static void main(String[] args) {
        BigObject bigObject = new BigObject.Builder("11")
                .withParam2("222")
                .withParam3("333")
                .withParam4("444")
                .withParam5("555")
                .build();
        System.out.println(bigObject);
    }
}

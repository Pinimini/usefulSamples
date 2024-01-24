package org.example;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        deserialize(serialize());
    }

    private static byte[] serialize() throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            Person person = new Person(12, "SerialPersonForArray", "value");
            System.out.println("Serializing: " + person);
            objectOutputStream.writeObject(person);
            return byteArrayOutputStream.toByteArray();
        }
    }

    private static void deserialize(byte[] data) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println("deSerialized person: " + person);
        }
    }
}

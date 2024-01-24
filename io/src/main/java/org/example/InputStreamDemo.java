package org.example;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("current dir :" + System.getProperty("user.dir"));
        //zipFile("textFile.txt");
        writeObject("person.bin");
        //readObject("person.bin");
    }

    private static void zipFile(String textFile) throws IOException {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(textFile));
             ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(textFile + "_copy.zip")))) {

            ZipEntry zipEntry = new ZipEntry(textFile);
            zipOutputStream.putNextEntry(zipEntry);
            byte[] buffer = new byte[2];
            int size;
            while ((size = bufferedInputStream.read(buffer, 0, buffer.length)) > 0) {
                for (byte b :
                        buffer) {
                    System.out.println(b);
                }
                zipOutputStream.write(buffer, 0, size);
            }
            zipOutputStream.closeEntry();
        }
    }

    private static void writeObject(String personFile) throws IOException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(personFile))) {
            Person person = new Person(92, "SerialPerson", "hidden");
            System.out.println("serializing: " + person);
            objectOutputStream.writeObject(personFile);
        }
    }

    private static void readObject(String personFile) throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(personFile))) {

            //objectInputStream.read()
            var person = (Person) objectInputStream.readObject();
            System.out.println("read object: " + person);
        }
    }
}

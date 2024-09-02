package org.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.management.ObjectName;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.PlatformManagedObject;
import java.nio.charset.StandardCharsets;

@Data
@Slf4j
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        BufferedReaderExample bufferedReaderExample = new BufferedReaderExample();
        InputStream fileInputStream = bufferedReaderExample.getClass().getClassLoader().getResourceAsStream("textFile.txt");

        log.info("fileInputStream.available()1 {}", fileInputStream.available());
        BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream), 2);

        log.info("fileInputStream.read()2 {}", fileInputStream.read());
        log.info("fileInputStream.available()2 {}", fileInputStream.available());
        //fileInputStream.close();
        int s = br.read();
        log.info("fileInputStream.available()3 {}", fileInputStream.available());

        String s1 = br.readLine();
        log.info("fbr.readLine() {}", s);
        log.info("fbr.readLine() {}", s1);
        log.info("fileInputStream.read()3 {}", br.read());
        log.info("fileInputStream.available()4 {}", fileInputStream.available());
        log.info("fileInputStream.read()4 {}", fileInputStream.read());


    }
}

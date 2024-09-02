package ru.simple;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class ServerSocketDemo {

    public static void main(String[] args) throws IOException {
        ServerSocketDemo serverSocketDemo = new ServerSocketDemo();

        serverSocketDemo.doSomething();

    }

    private void doSomething() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(5454)) {
            while (true) {
                Socket socket = serverSocket.accept();
                OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
                writer.write("HTTP/1.0 200 OK\r\n" +
                        "Content-type:text/html\r\n" +
                        "\r\n" +
                        "<h1>Hello World</h1>");

                writer.flush();
                writer.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private void task(int i) {
        System.out.println("call is done " + i);
    }
}

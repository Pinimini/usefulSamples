package ru.webserver.example.server;

public interface UserWebServer {
    void start() throws Exception;

    void join() throws Exception;

    void stop() throws Exception;
}

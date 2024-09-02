package ru.webserver.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.eclipse.jetty.server.Server;
import ru.webserver.example.dao.InMemoryUserDao;
import ru.webserver.example.dao.UserDao;
import ru.webserver.example.handlers.HelloHandler;
import ru.webserver.example.server.UserWebServer;
import ru.webserver.example.server.UserWebServerSimple;
import ru.webserver.example.service.TemplateProcessor;
import ru.webserver.example.service.TemplateProcessorImpl;

import java.io.IOException;

public class Main {
    private static final int WEB_SERVER_PORT = 8080;
    private static final String TEMPLATES_DIR = "/templates/";

    public static void main(String[] args) throws Exception {
        UserDao userDao = new InMemoryUserDao();
        Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
        TemplateProcessor templateProcessor = new TemplateProcessorImpl(TEMPLATES_DIR);

        UserWebServer usersWebServer = new UserWebServerSimple(WEB_SERVER_PORT, userDao,
                gson, templateProcessor);

        usersWebServer.start();
        usersWebServer.join();
    }
}

package org.example.creational.abstractfactory.developmentteam.app;

import org.example.creational.abstractfactory.developmentteam.Developer;

public class AppDeveloper implements Developer {
    @Override
    public void writeProgram() {
        System.out.println("Write app");
    }
}

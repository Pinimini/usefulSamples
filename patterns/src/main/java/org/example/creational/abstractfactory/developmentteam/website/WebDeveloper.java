package org.example.creational.abstractfactory.developmentteam.website;

import org.example.creational.abstractfactory.developmentteam.Developer;

public class WebDeveloper implements Developer {
    @Override
    public void writeProgram() {
        System.out.println("Write web site");
    }
}

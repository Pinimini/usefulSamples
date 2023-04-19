package org.example.creational.abstractfactory.developmentteam.app;

import org.example.creational.abstractfactory.developmentteam.Analyst;

public class AppAnalyst implements Analyst {
    @Override
    public void analyzesProgram() {
        System.out.println("Analyzes app");
    }
}

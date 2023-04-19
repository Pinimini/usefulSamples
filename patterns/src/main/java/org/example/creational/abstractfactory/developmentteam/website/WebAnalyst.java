package org.example.creational.abstractfactory.developmentteam.website;

import org.example.creational.abstractfactory.developmentteam.Analyst;

public class WebAnalyst implements Analyst {
    @Override
    public void analyzesProgram() {
        System.out.println("Analyzes web site");
    }
}

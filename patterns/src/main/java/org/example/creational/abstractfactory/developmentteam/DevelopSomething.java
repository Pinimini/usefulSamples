package org.example.creational.abstractfactory.developmentteam;

import org.example.creational.abstractfactory.developmentteam.app.AppTeamFactory;
import org.example.creational.abstractfactory.developmentteam.website.WebTeamFactory;

import java.util.LinkedList;


public class DevelopSomething {
    public static void main(String[] args) {
        developApp(new AppTeamFactory());
        System.out.println("The application was developed");
        developApp(new WebTeamFactory());
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList);

    }

    private static void developApp(TeamFactory teamFactory) {
        Analyst analyst = teamFactory.createAnalyst();
        Developer developer = teamFactory.createDeveloper();
        Tester tester = teamFactory.createTester();
        analyst.analyzesProgram();
        developer.writeProgram();
        tester.testsProgram();
    }
}
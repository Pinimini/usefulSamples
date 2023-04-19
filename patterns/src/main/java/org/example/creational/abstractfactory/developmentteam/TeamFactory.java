package org.example.creational.abstractfactory.developmentteam;

public interface TeamFactory {
    Analyst createAnalyst();
    Developer createDeveloper();
    Tester createTester();
}

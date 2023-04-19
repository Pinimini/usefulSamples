package org.example.creational.abstractfactory.developmentteam.app;

import org.example.creational.abstractfactory.developmentteam.Analyst;
import org.example.creational.abstractfactory.developmentteam.Developer;
import org.example.creational.abstractfactory.developmentteam.TeamFactory;
import org.example.creational.abstractfactory.developmentteam.Tester;

public class AppTeamFactory implements TeamFactory {
    @Override
    public Analyst createAnalyst() {
        return new AppAnalyst();
    }

    @Override
    public Developer createDeveloper() {
        return new AppDeveloper();
    }

    @Override
    public Tester createTester() {
        return new AppTester();
    }
}

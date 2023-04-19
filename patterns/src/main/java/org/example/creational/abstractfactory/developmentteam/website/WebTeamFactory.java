package org.example.creational.abstractfactory.developmentteam.website;

import org.example.creational.abstractfactory.developmentteam.Analyst;
import org.example.creational.abstractfactory.developmentteam.Developer;
import org.example.creational.abstractfactory.developmentteam.TeamFactory;
import org.example.creational.abstractfactory.developmentteam.Tester;

public class WebTeamFactory implements TeamFactory {
    @Override
    public Analyst createAnalyst() {
        return new WebAnalyst();
    }

    @Override
    public Developer createDeveloper() {
        return new WebDeveloper();
    }

    @Override
    public Tester createTester() {
        return new WebTester();
    }
}

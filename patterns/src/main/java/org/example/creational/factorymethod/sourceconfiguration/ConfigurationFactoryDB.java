package org.example.creational.factorymethod.sourceconfiguration;

public class ConfigurationFactoryDB extends ConfigurationFactory {
    @Override
    Configuration buildConfiguration() {
        return new ConfigurationDB();
    }
}

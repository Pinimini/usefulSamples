package org.example.creational.factorymethod.sourceconfiguration;

public class ConfigurationFactoryFile extends ConfigurationFactory {

    @Override
    Configuration buildConfiguration() {
        return new ConfigurationFile();
    }
}

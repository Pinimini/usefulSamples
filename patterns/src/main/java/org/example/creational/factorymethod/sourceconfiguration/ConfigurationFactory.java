package org.example.creational.factorymethod.sourceconfiguration;

public abstract class ConfigurationFactory {

    abstract Configuration buildConfiguration();

    static ConfigurationFactory getConfigurationFactory(String source) {
        if (source.equalsIgnoreCase("db")) {
            return new ConfigurationFactoryDB();
        } else if (source.equalsIgnoreCase("file")) {
            return new ConfigurationFactoryFile();
        } else {
            throw new RuntimeException("unknown source: " + source);
        }
    }
}

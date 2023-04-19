package org.example.creational.factorymethod.sourceconfiguration;

public class ConfigurationCreator {
    public static void main(String[] args) {
        ConfigurationFactory configurationFactory = ConfigurationFactory.getConfigurationFactory("db");
        Configuration configuration = configurationFactory.buildConfiguration();
        System.out.println(configuration.getClass().getSimpleName());
    }
}

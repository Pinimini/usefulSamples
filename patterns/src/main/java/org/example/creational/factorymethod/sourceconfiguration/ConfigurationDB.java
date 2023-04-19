package org.example.creational.factorymethod.sourceconfiguration;

public class ConfigurationDB implements Configuration {
    @Override
    public String params() {
        return "params from DB";
    }
}

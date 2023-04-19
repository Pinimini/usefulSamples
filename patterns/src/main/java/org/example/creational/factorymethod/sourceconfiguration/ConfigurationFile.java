package org.example.creational.factorymethod.sourceconfiguration;

public class ConfigurationFile implements Configuration {
    @Override
    public String params() {
        return "params from File";
    }
}

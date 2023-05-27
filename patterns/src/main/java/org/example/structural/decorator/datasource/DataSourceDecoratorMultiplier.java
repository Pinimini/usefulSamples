package org.example.structural.decorator.datasource;

public class DataSourceDecoratorMultiplier implements DataSource {
    DataSource dataSource;

    public DataSourceDecoratorMultiplier(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int getInteger() {
        return dataSource.getInteger() * 2;
    }
}

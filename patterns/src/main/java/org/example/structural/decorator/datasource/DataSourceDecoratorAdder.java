package org.example.structural.decorator.datasource;

public class DataSourceDecoratorAdder implements DataSource {
    DataSource dataSource;

    public DataSourceDecoratorAdder(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int getInteger() {
        return dataSource.getInteger() + 10;
    }
}

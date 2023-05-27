package org.example.structural.decorator.datasource;

public class Demo {
    public static void main(String[] args) {
        DataSource ds = new DataSourceImpl();
        printer(ds);

        printer(new DataSourceDecoratorAdder(ds));
        printer(new DataSourceDecoratorMultiplier(ds));
        printer(new DataSourceDecoratorAdder(new DataSourceDecoratorMultiplier(ds)));
    }

    private static void printer(DataSource ds) {
        System.out.println(ds.getInteger());
    }
}

package org.example.creational.objectpool;

public class ConnectionObjectFactory implements ObjectFactory<Connection> {
    @Override
    public Connection create() {
        System.out.println("Create new Connection");
        return new ConnectionPostgres();
    }
}

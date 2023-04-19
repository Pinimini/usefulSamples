package org.example.creational.prototype.sheep;

public class CopyableSheep implements Copyable<CopyableSheep> {
    private String name;

    public CopyableSheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CopyableSheep copy() {
        return new CopyableSheep(name);
    }
}

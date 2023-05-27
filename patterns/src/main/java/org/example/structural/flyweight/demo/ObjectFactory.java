package org.example.structural.flyweight.demo;

public class ObjectFactory {
    private final HeavyCommonPart heavyCommonPart;

    public ObjectFactory() {
        this.heavyCommonPart = new HeavyCommonPart();
    }

    public ObjectOnLine create(int x) {
        return new ObjectOnLine(heavyCommonPart, x);
    }
}

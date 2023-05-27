package org.example.structural.proxy.lazy;

public class LazyProxyHeavyObject implements HeavyObject {

    HeavyObject heavyObject;

    public LazyProxyHeavyObject(HeavyObject heavyObject) {
        this.heavyObject = heavyObject;
    }

    @Override
    public void init(String value) {
        heavyObject.init(value);
    }

    @Override
    public boolean isInit() {
        return heavyObject.isInit();
    }

    @Override
    public String getValue() {
        if (!heavyObject.isInit()) {
            heavyObject.init("bigVal");
        }
        return heavyObject.getValue();
    }
}

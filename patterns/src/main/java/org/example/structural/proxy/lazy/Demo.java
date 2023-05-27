package org.example.structural.proxy.lazy;

public class Demo {
    public static void main(String[] args) {
        HeavyObject heavyObject = new HeavyObjectImpl();
        System.out.println(heavyObject);

        HeavyObject heavyObjectProxy = new LazyProxyHeavyObject(heavyObject);

        System.out.println(heavyObjectProxy.getValue());
        System.out.println(heavyObject);
        System.out.println(heavyObjectProxy.getValue());
    }
}

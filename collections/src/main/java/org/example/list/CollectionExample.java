package org.example.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CollectionExample<T> implements Iterable {
    T value;
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}

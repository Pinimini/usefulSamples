package org.example.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class ObjectPool<T> {
    private final int maxSize;
    private final ObjectFactory<T> objectFactory;
    private final Consumer<T> pooledObjectInitializer;

    private final Queue<T> free = new LinkedList<>();
    private final Queue<T> used = new LinkedList<>();

    public ObjectPool(int initialSize, int maxSize, ObjectFactory<T> objectFactory, Consumer<T> pooledObjectInitializer) {
        this.maxSize = maxSize;
        this.objectFactory = objectFactory;
        this.pooledObjectInitializer = pooledObjectInitializer;

        initPool(initialSize);
    }

    public T get() {
        int freeBefore = free.size();
        int usedBefore = used.size();

        T obj = free.poll();
        if (obj == null) {
            if (used.size() == this.maxSize) {
                throw new ObjectPoolMaxSizeException(maxSize);
            }

            obj = objectFactory.create();
            pooledObjectInitializer.accept(obj);

        }
        used.offer(obj);

        System.out.printf("get() free=%d used=%d | free=%d used=%d\n",
                freeBefore, usedBefore, free.size(), used.size());
        return obj;
    }

    public void release(T obj) {
        var freeBefore = free.size();
        var usedBefore = used.size();

        used.remove(obj);
        free.add(obj);

        System.out.printf("release() free=%d used=%d | free=%d used=%d\n",
                freeBefore, usedBefore, free.size(), used.size());
    }

    private void initPool(int initialSize) {
        for (int i = 0; i < initialSize; i++) {
            T obj = objectFactory.create();
            pooledObjectInitializer.accept(obj);
            free.add(obj);
        }
    }
}

class ObjectPoolMaxSizeException extends RuntimeException {
    public ObjectPoolMaxSizeException(int maxSize) {
        super("Cannot create object. Reached maximum pool size of " + maxSize + " objects.");
    }
}
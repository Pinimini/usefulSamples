package com.useful.webflux.producer;

public interface DataProducer<T> {

    T produce(long seed);
}

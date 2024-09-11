package com.useful.webflux.processor;

public interface DataProcessor<T> {

    T process(T data);
}

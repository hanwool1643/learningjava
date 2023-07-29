package com.programmers.java.lamda;

@FunctionalInterface
public interface MyConsumer<T> {
    void consume(T t);
}

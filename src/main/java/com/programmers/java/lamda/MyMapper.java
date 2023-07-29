package com.programmers.java.lamda;

@FunctionalInterface
public interface MyMapper<IN, OUT> {
    OUT map(IN s);
}

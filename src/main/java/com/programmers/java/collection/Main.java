package com.programmers.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        new MyCollection<>(Arrays.asList(1,2,3,4,5))
                .foreach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }
}

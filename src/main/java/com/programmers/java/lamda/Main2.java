package com.programmers.java.lamda;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
//        new Main2().loop(10, i -> System.out.println(i));
        new Main2().filteredNumbers(30,
                i -> i % 2==0,
                System.out::println
                );
    }

    void filteredNumbers(int max, Predicate<Integer> p, Consumer<Integer> c) {
        for(int i = 0; i<max ; i++) {
            if(p.test(i)) c.accept(i);
        }

    }
    void loop(int n, MyConsumer<Integer> consumer) {//MyConsumer쪽(외부에) 의존성을 맡김
        for(int i=0; i<n; i++) {
            consumer.consume(i);
        }
    }
}

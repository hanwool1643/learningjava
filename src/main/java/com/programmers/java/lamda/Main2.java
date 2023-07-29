package com.programmers.java.lamda;

public class Main2 {
    public static void main(String[] args) {
        new Main2().loop(10, i -> System.out.println(i));
    }

    void loop(int n, MyConsumer<Integer> consumer) {//MyConsumer쪽(외부에) 의존성을 맡김
        for(int i=0; i<n; i++) {
            consumer.consume(i);
        }
    }
}

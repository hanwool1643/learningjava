package com.programmers.java.func;

public class Main2 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        //익명 메소드를 사용해서 표현하는 방법: 람다 표헌
        MyRunnable r2 = () -> System.out.println("Hello");

        MyRunnable r3 = () -> {
            MySupply s1 = () -> "Hello Hello Hello";
            System.out.println(s1.supply());
        };
    }
}

package com.programmers.java.func;

public interface MyRunnable {
    void run(); //추상 메서드가 하나밖에 없는 메소드 == 인터페이스
}

interface MyRunnable2 {
    void run();
    void run2();
}
interface  MyMap {
    void map();
    default void sayHello() {//default는 추상 메서드 아님
        System.out.println("Hello World");
    }

    static void sayBye() {//static도 추상 메서드 아님
        System.out.println("Bye World");
    }
}

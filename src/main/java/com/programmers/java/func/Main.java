package com.programmers.java.func;

class Greeting implements MySupply {
    @Override
    public String supply() {
        return "Hello World";
    }
}
class SayHello implements  MyRunnable {
    @Override
    public void run() {
        System.out.println(new Greeting().supply());
    }
}
public class Main {
    public static void main(String[] args) {
        new SayHello().run();
    }
}

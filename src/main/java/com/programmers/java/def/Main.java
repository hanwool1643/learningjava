package com.programmers.java.def;

public class Main {
    public static void main(String[] args) {
        new Service().method1();
    }
}

class Service extends Object implements MyInterface {
    //만약 이미 extends 하고 있는 클래스가 있으면 adapter 못씀
    //default method를 사용해서(Myinterface 모든 메서드) 일부 메서드만 오버라이드 하게
    @Override
    public void method1() {
        System.out.println("Method1");
    }

}

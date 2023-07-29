package com.programmers.java.def2;

class Duck implements Swimmable, Walkable {
    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }
}

class Swan implements Flyable, Walkable {

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }
}
public class Main {
    public static void main(String[] args) {
        new Swan().fly();
    }
}

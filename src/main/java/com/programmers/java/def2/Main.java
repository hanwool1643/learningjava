package com.programmers.java.def2;

class Duck implements Swimmable, Walkable {}

class Swan implements Flyable, Walkable {}
public class Main {
    public static void main(String[] args) {
        new Duck().walk();
        new Duck().swim();
        new Swan().fly();
    }
}

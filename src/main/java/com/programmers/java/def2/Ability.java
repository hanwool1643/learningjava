package com.programmers.java.def2;

interface Flyable {
    default void fly() {
        System.out.println("Fly");
    }
}

interface Swimmable {
    default void swim() {
        System.out.println("Swim");
    }
}

interface Walkable {
    default void walk() {
        System.out.println("Walk");
    }
}

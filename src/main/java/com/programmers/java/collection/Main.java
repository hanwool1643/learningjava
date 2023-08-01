package com.programmers.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        MyCollection <String> c1 = new MyCollection<>(Arrays.asList("A","BC","CDA","DEFD","EFASE"));

        MyCollection <Integer> c2 = c1.map(String::length);

        c2.foreach(System.out::println);
    }
}

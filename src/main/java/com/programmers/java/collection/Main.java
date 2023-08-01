package com.programmers.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // method chain
        new MyCollection<>(Arrays.asList("A","BC","CDA","DEFD","EFASE"))
        .map(String::length)
        .filter(i->i%2 ==0)
        .foreach(System.out::println);
    }
}

package com.programmers.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        new MyCollection<>(Arrays.asList("A","BC","CDA","DEFD","EFASE"))
        .map(String::length)
        .foreach(System.out::println);
    }
}

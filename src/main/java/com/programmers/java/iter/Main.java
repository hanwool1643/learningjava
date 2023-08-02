package com.programmers.java.iter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","BC","CDA","DEFD","EFASE");
        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

package com.programmers.java.collection;

import com.programmers.java.iter.MyIterator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        MyIterator<String> iter =
        new MyCollection<>(Arrays.asList("A", "BC", "CDA", "DEFD", "EFASE"))
                .iterator();

        while(iter.hasNext()) {
            String s = iter.next();
            int len = s.length();
            if(len % 2==0) continue;
            System.out.println(s);
        }
    }

    ;
}
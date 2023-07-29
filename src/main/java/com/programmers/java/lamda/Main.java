package com.programmers.java.lamda;

import com.programmers.java.func.MyRunnable;
import com.programmers.java.func.MySupply;

public class Main {
    public static void main(String[] args) {

        MySupplier s = () ->"Hello World";

        MyMapper m = String::length;

        MyConsumer c = System.out::println;

        MyRunnable r = () -> c.consume(m.map(s.supply()));

        r.run();
    }
}

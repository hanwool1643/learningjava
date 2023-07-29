package com.programmers.java.lamda;

import com.programmers.java.func.MyRunnable;
import com.programmers.java.func.MySupply;

public class Main {
    public static void main(String[] args) {

        MySupplier s = () ->"Hello World";

        MyMapper m = (str) -> str.length();

        MyConsumer c = i -> System.out.println(i);

        MyRunnable r = () -> c.consume(m.map(s.supply()));

        r.run();
    }
}

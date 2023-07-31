package com.programmers.java.collection;

import java.util.List;
import java.util.function.Consumer;

public class MyCollection<T> {
    private List<T> list;

    public MyCollection(List<T> list) {
        this.list = list;
    }

    public void foreach(Consumer<T> consumer) {
        for(int i = 0; i < list.size(); i ++) {
            T data = list.get(i);
            consumer.accept(data);
        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add("" + i);
        }

        // Streams are lazy, so we need to have a terminal method to invoke our intermediate methods
        Stream<String> stream = list.stream().filter(s -> Integer.parseInt(s) > 9_990);
        // We can use iterator and spliterator with streams
        // To our luck, iterator - is a terminal method, so we can make all things work.
        Iterator<String> iterator = stream.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = getFilledList();

        Stream<String> stream = list.stream()
                .filter(s -> Integer.parseInt(s) > 9_790)
                .filter(s -> Integer.parseInt(s) % 117 == 3);
        Iterator<String> iterator = stream.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static List<String> getFilledList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add("" + i);
        }
        return list;
    }
}
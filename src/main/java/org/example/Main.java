package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<String> list = getFilledList();

        Stream<String> stream = list.stream().filter(s -> Integer.parseInt(s) > 9_990);
        Iterator<String> iterator = stream.iterator();

        Runnable runnable = getRunnable(list);
        Thread thread = new Thread(runnable);
        thread.start();

        while (iterator.hasNext()) {
            Thread.sleep(200);
            System.out.println(iterator.next());
        }

        thread.join();

    }

    private static Runnable getRunnable(List<String> list) {
        return () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                list.add("" + i);
            }
        };
    }

    private static List<String> getFilledList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add("" + i);
        }
        return list;
    }
}
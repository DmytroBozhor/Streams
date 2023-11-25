package org.example;

@FunctionalInterface
public interface MyFunctionalInterface {
    void foo();

//    default void poo() {
//        System.out.println("foo");
//    }

    boolean equals(Object obj);
}

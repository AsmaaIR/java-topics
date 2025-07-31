package com.java8;

@FunctionalInterface
public interface ExampleInterface {
    void exampleMethod(String msg);

    default void defaultMethod(String msg){
        System.out.println("msg");
    }

    static void staticMethod(String msg) {
        System.out.println(msg);
    }
}

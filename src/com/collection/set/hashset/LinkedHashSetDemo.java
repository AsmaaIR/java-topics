package com.collection.set.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> languages = new LinkedHashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("R");
        languages.add("GO");
        languages.add("JavaScript");
        System.out.println("LinkedHashSet: " + languages);

    }
}

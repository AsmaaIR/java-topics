package com.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();
        // Using add() method
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("R");
        languages.add("GO");
        System.out.println("HashSet: " + languages);

        // Trying to add a duplicate element
        boolean added = languages.add("JavaScript");
        System.out.println("Was 'JavaScript' added again? " + added);

        // Displaying the HashSet elements
        System.out.println("HashSet elements: " + languages);

        // Removing an element
        boolean isRubyRemoved = languages.remove("Ruby");
        System.out.println("Ruby lang is removed? " + isRubyRemoved);
        System.out.println("HashSet After removing Ruby : " + languages);

        // Checking if an element exists
        boolean containsXyz = languages.contains("xyz");
        System.out.println("Does HashSet contain 'xyz'? " + containsXyz);

        // Getting the size of the HashSet
        System.out.printf("size of languages: " + languages.size());

    }
}

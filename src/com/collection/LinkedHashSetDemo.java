package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashSet demo ===");

        // LinkedHashSet maintains insertion order while still enforcing uniqueness.
        Set<String> languages = new LinkedHashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("R");
        languages.add("Go");
        languages.add("JavaScript");
        System.out.println("languages (insertion order) = " + languages);

        System.out.println("\n-- Iterate preserves insertion order --");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }
    }
}

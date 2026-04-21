package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        System.out.println("=== HashSet demo ===");

        Set<String> languages = new HashSet<>();

        System.out.println("\n-- 1) Add (order is not guaranteed) --");
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("R");
        languages.add("Go");
        System.out.println("languages = " + languages);

        System.out.println("\n-- 2) Uniqueness (duplicates are ignored) --");
        boolean addedAgain = languages.add("JavaScript");
        System.out.println("add(\"JavaScript\") again success? " + addedAgain);
        System.out.println("languages = " + languages);

        System.out.println("\n-- 3) contains / size --");
        System.out.println("contains(\"Ruby\") = " + languages.contains("Ruby"));
        System.out.println("contains(\"xyz\") = " + languages.contains("xyz"));
        System.out.println("size = " + languages.size());

        System.out.println("\n-- 4) Remove --");
        boolean removedRuby = languages.remove("Ruby");
        System.out.println("remove(\"Ruby\") success? " + removedRuby);
        System.out.println("languages = " + languages);

        System.out.println("\n-- 5) Iterate --");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }
    }
}

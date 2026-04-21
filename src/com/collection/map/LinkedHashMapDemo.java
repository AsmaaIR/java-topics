package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashMap demo ===");

        // LinkedHashMap preserves insertion order (and can also be configured for access-order).
        Map<String, String> capitals = new LinkedHashMap<>();

        System.out.println("\n-- 1) Insertion order --");
        capitals.put("Egypt", "Cairo");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Germany", "Berlin");
        System.out.println("capitals = " + capitals);

        System.out.println("\n-- 2) Overwrite keeps key position (same key) --");
        capitals.put("Japan", "Tokyo (updated)");
        System.out.println("capitals = " + capitals);

        System.out.println("\n-- 3) Iterate (stable order) --");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


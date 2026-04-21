package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("=== HashMap demo ===");

        Map<String, Integer> stockBySku = new HashMap<>();

        System.out.println("\n-- 1) put / get / getOrDefault --");
        stockBySku.put("SKU-APPLE", 10);
        stockBySku.put("SKU-BANANA", 5);
        stockBySku.put("SKU-ORANGE", 7);
        System.out.println("stockBySku = " + stockBySku);
        System.out.println("get(SKU-APPLE) = " + stockBySku.get("SKU-APPLE"));
        System.out.println("get(missing) = " + stockBySku.get("SKU-MISSING"));
        System.out.println("getOrDefault(missing, 0) = " + stockBySku.getOrDefault("SKU-MISSING", 0));

        System.out.println("\n-- 2) Overwrite value (same key) --");
        stockBySku.put("SKU-APPLE", 12);
        System.out.println("after put(SKU-APPLE, 12): " + stockBySku);

        System.out.println("\n-- 3) containsKey / containsValue --");
        System.out.println("containsKey(SKU-BANANA) = " + stockBySku.containsKey("SKU-BANANA"));
        System.out.println("containsValue(7) = " + stockBySku.containsValue(7));

        System.out.println("\n-- 4) Iterate keys / values / entries --");
        System.out.println("keys:");
        for (String key : stockBySku.keySet()) {
            System.out.println("- " + key);
        }

        System.out.println("values:");
        for (Integer value : stockBySku.values()) {
            System.out.println("- " + value);
        }

        System.out.println("entries:");
        for (Map.Entry<String, Integer> entry : stockBySku.entrySet()) {
            System.out.println("- " + entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n-- 5) compute / merge for counters --");
        stockBySku.merge("SKU-BANANA", 1, Integer::sum); // increment by 1
        stockBySku.merge("SKU-MANGO", 1, Integer::sum);  // insert if missing
        System.out.println("after merge increments: " + stockBySku);

        stockBySku.compute("SKU-ORANGE", (k, v) -> v == null ? 0 : v * 2);
        System.out.println("after compute double oranges: " + stockBySku);

        System.out.println("\n-- 6) remove --");
        Integer removed = stockBySku.remove("SKU-APPLE");
        System.out.println("removed SKU-APPLE value = " + removed);
        System.out.println("stockBySku = " + stockBySku);
    }
}


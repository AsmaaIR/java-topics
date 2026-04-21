package com.collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        System.out.println("=== TreeMap demo ===");

        NavigableMap<Integer, String> nameByScore = new TreeMap<>();

        System.out.println("\n-- 1) put (keys are sorted) --");
        nameByScore.put(90, "Alice");
        nameByScore.put(70, "Bob");
        nameByScore.put(85, "Carla");
        nameByScore.put(100, "Dina");
        System.out.println("nameByScore = " + nameByScore);

        System.out.println("\n-- 2) firstEntry / lastEntry --");
        System.out.println("firstEntry = " + nameByScore.firstEntry());
        System.out.println("lastEntry  = " + nameByScore.lastEntry());

        System.out.println("\n-- 3) range views (headMap / tailMap / subMap) --");
        System.out.println("headMap(<85) = " + nameByScore.headMap(85, false));
        System.out.println("tailMap(>=85) = " + nameByScore.tailMap(85, true));
        System.out.println("subMap([70..90]) = " + nameByScore.subMap(70, true, 90, true));

        System.out.println("\n-- 4) navigation helpers --");
        System.out.println("higherKey(85) = " + nameByScore.higherKey(85));
        System.out.println("lowerKey(85)  = " + nameByScore.lowerKey(85));
        System.out.println("ceilingKey(86) = " + nameByScore.ceilingKey(86));
        System.out.println("floorKey(86)   = " + nameByScore.floorKey(86));

        System.out.println("\n-- 5) Iterate entries in sorted order --");
        for (Map.Entry<Integer, String> entry : nameByScore.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


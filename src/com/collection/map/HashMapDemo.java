package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> languages = new HashMap<>();

		// add elements to hashmap
		languages.put("Java", 4);
		languages.put("JavaScript", 10);
		languages.put("Python", 7);
		languages.put("R", 1);
		System.out.println(languages);


		// return set view of keys using keySet()
		System.out.println("Keys: " + languages.keySet());
//
		// return set view of values using values()
		System.out.println("Values: " + languages.values());
//
		// return set view of key/value pairs using entrySet()
		System.out.println("Key/Value mappings: " + languages.entrySet());

//        // replace elements
		languages.replace("R", 3);
		System.out.println("After replace(): " + languages);

		languages.put("R", 50);
		System.out.println("After replace(): " + languages);

		// iterate through keys only
		System.out.print("Keys: ");
		for (String key : languages.keySet()) {
			System.out.print(key);
			System.out.print(", ");
		}
//
		// iterate through values only
		System.out.print("\nValues: ");
		for (Integer value : languages.values()) {
			System.out.print(value);
			System.out.print(", ");
		}
//
		// iterate through key/value entries
		System.out.print("\nEntries: ");
		for (Map.Entry<String, Integer> entry : languages.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}

	}
}

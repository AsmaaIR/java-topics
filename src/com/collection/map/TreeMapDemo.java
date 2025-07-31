package com.collection.map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> numbers = new TreeMap<>();
		// add elements
		numbers.put(4, "four");
		numbers.put(1, "one");
		numbers.put(3, "three");
//		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(9, "nine");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(2, "two");
		numbers.putIfAbsent(2, "two"); // This will not change the value for key 2 since it already exists


		System.out.println("TreeMap of numbers: " + numbers);

		// Using entrySet()
		System.out.println("Key/Value mappings: " + numbers.entrySet());

		// Using keySet()
		System.out.println("Keys: " + numbers.keySet());

		// Using values()
		System.out.println("Values: " + numbers.values());

		// Using the firstKey() method
		Integer firstKey = numbers.firstKey();
		System.out.println("First Key: " + firstKey);

		// Using the lastKey() method
		Integer lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);

		// Using firstEntry() method
		System.out.println("First Entry: " + numbers.firstEntry());

		// Using the lastEntry() method
		System.out.println("Last Entry: " + numbers.lastEntry());

		// ceilingKey() method
		Integer ceilingKey = numbers.ceilingKey(5);
		System.out.println("Ceiling Key for 5: " + ceilingKey);

		// floorKey() method
		Integer floorKey = numbers.floorKey(5);
		System.out.println("Floor Key for 5: " + floorKey);

		// higherKey() method
		Integer higherKey = numbers.higherKey(5);
		System.out.println("Higher Key for 5: " + higherKey);

		// lowerKey() method
		Integer lowerKey = numbers.lowerKey(5);
		System.out.println("Lower Key for 5: " + lowerKey);

		// pollFirstEntry() method
		System.out.println("Poll First Entry: " + numbers.pollFirstEntry());

		// pollLastEntry() method
		System.out.println("Poll Last Entry: " + numbers.pollLastEntry());

		// Using the get() method
		String valueForKey3 = numbers.get(3);
		System.out.println("Value for Key 3: " + valueForKey3);

		// Using the containsKey() method
		boolean containsKey3 = numbers.containsKey(3);
		System.out.println("Contains Key 3: " + containsKey3);

		// Using the containsValue() method
		boolean containsValueThree = numbers.containsValue("three");
		System.out.println("Contains Value 'three': " + containsValueThree);

		// Using the isEmpty() method
		boolean isEmpty = numbers.isEmpty();
		System.out.println("Is TreeMap Empty: " + isEmpty);

		// Using the size() method
		int size = numbers.size();
		System.out.println("Size of TreeMap: " + size);


		// subMap() method
		System.out.println("SubMap from 'four' inclusive to 'seven' inclusive: " + numbers.subMap(4, 7));
		System.out.println("SubMap from 'four' inclusive to 'seven' exclusive: " + numbers.subMap(4, true, 7, false));
		System.out.println("SubMap from 'four' exclusive to 'seven' inclusive: " + numbers.subMap(4, false, 7, true));
		System.out.println("SubMap from 'four' exclusive to 'seven' exclusive: " + numbers.subMap(4, false, 7, false));
		// headMap() method
		System.out.println("HeadMap up to 'four': " + numbers.headMap(4));
		// tailMap() method
		System.out.println("TailMap from 'four': " + numbers.tailMap(4));


		// Using the remove() method
		numbers.remove(2);
		System.out.println("TreeMap after removing 'two': " + numbers);

		// Using the clone() method
		TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) numbers.clone();
		System.out.println("Cloned TreeMap: " + clonedMap);

		// Using the clear() method
		numbers.clear();
		System.out.println("Numbers TreeMap after clearing: " + numbers);
		System.out.println("Cloned TreeMap after clearing original: " + clonedMap);

		// Using the comparator() method
		System.out.println("Comparator used by TreeMap: " + numbers.comparator());

		// Using the descendingMap() method
		System.out.println("Descending Map: " + clonedMap.descendingMap());
		// Using the descendingKeySet() method
		System.out.println("Descending Key Set: " + clonedMap.descendingKeySet());
		// Using the navigableKeySet() method
		System.out.println("Navigable Key Set: " + clonedMap.navigableKeySet());
		// Using the values() method
		System.out.println("Values in Cloned TreeMap: " + clonedMap.values());
		// Using the forEach() method
		clonedMap.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});

		// Using the replace() method
		clonedMap.replace(1, "one", "uno");
		System.out.println("Cloned TreeMap after replacing 'one' with 'uno': " + clonedMap);
		// Using the replaceAll() method
		clonedMap.replaceAll((key, value) -> value.toUpperCase());
		System.out.println("Cloned TreeMap after replacing all values to uppercase: " + clonedMap);

		// Using the compute() method
		clonedMap.compute(3, (key, value) -> value == null ? "three" : value + " updated");
		System.out.println("Cloned TreeMap after compute on key 3: " + clonedMap);
		// Using the computeIfAbsent() method
		clonedMap.computeIfAbsent(10, key -> "ten");
		System.out.println("Cloned TreeMap after computeIfAbsent on key 10: " + clonedMap);
		// Using the computeIfPresent() method
		clonedMap.computeIfPresent(1, (key, value) -> value + " present");
		System.out.println("Cloned TreeMap after computeIfPresent on key 1: " + clonedMap);


	}
}

package com.collection;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
           /*Array*/
//        int [] numbers = new int[5]; //way1
//        int[] nums = {10, 20, 30, 40, 50}; //way2
//        System.out.println(numbers.length);
//        System.out.println(nums.length);
//
//        numbers[0] =3;
//        numbers[1] =4;
//        numbers[2] =5;
//        numbers[3] =6;
//        numbers[4] =7;
//        nums[2]= 60;
//        System.out.println(nums[2]);

/*---------------------------------------------------------------------------------------*/
        /*List (ArrayList & LinkedList */
//        List<String> names = new ArrayList<>();
//        List<String> names1 = new LinkedList<>();
//        List<String> names2 = new Vector<>();
//        List<String> names3 = new Stack<>();

        /*ArrayList*/
        // create ArrayList
//        ArrayList<String> languages = new ArrayList<>();
//
//        // Add elements to ArrayList
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("Ruby");
//        System.out.println("ArrayList: " + languages);
//
//        // add element on index 3
//        languages.add(3, "JavaScript");
//        System.out.println("ArrayList: " + languages);
//
//        // get the element from the arraylist
//        String lang = languages.get(1);
//        System.out.println("Element at index 1: " + lang);
//
//        // update value of the element
//        languages.set(2, "kotlin");
//        System.out.println("ArrayList: " + languages);
//
//        // remove element from index 1
//         languages.remove(1);
//        System.out.println("ArrayList after removing element: " + languages);
//
//        //get Size of array
//        System.out.println(languages.size());

/*---------------------------------------------------------------------------------------*/
        /*Linked List*/
//        // Creating list using the LinkedList class
//        List<Integer> numbers = new LinkedList<>();
//
//        // Add elements to the list
//        numbers.add(6);
//        numbers.add(9);
//        numbers.add(3);
//        numbers.add(3, 5);
//        System.out.println("List: " + numbers);
//
//        // add() method with the index parameter
//        numbers.add(3, 50);
//        System.out.println("Updated LinkedList: " + numbers);
//
//        // Access element from the list
//        int number = numbers.get(1);
//        System.out.println("Accessed Element: " + number);
//
//        // Using the indexOf() method
//        int index = numbers.indexOf(9);
//        System.out.println("Position of 9 is " + index);
//
//        // change elements at index 3
//        numbers.set(3, 100);
//        System.out.println("changed LinkedList: " + numbers);
//
//        // Remove element from the list
//        int removedNumber = numbers.remove(1);
//        System.out.println("Removed Element: " + removedNumber);
//
//        //get size
//        System.out.println("List Size: " + numbers.size());

        /*LinkedList as Queue*/
//        Queue<String> names = new LinkedList<>();
//
//        // add elements
//        names.add("Ahmed");
//        names.add("Mohamed");
//        names.add("Mahmoud");
//        System.out.println("LinkedList: " + names);
//
//        // access the first element
//        String str1 = names.peek();
//        System.out.println("Accessed Element: " + str1);
//
//        // access and remove the first element
//        String str2 = names.poll();
//        System.out.println("Removed Element: " + str2);
//        System.out.println("LinkedList after poll(): " + names);

//        /*LinkedList as Deque*/
//        Deque<String> names = new LinkedList<>();
//        Deque<Integer> names1 = new LinkedList<>();
//
//        // add element at the beginning
//        names.add("Ahmed");
//        System.out.println("LinkedList: " + names);
//
//        names.addFirst("Mohamed");
//        System.out.println("LinkedList after addFirst(): " + names);
//
//        // add elements at the end
//        names.addLast("Mahmoud");
//        System.out.println("LinkedList after addLast(): " + names);
//
//        // remove the first element
//        names.removeFirst();
//        System.out.println("LinkedList after removeFirst(): " + names);
//
//        // remove the last element
//        names.removeLast();
//        System.out.println("LinkedList after removeLast(): " + names);

/*---------------------------------------------------------------------------------------------------*/
           /* Hash Set*/
//        HashSet<String> languages = new HashSet<>();
//        // Using add() method
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("Ruby");
//        languages.add("JavaScript");
//        languages.add("R");
//        languages.add("GO");
//        languages.add("JavaScript");
//        System.out.println("HashSet: " + languages);
//        // Using remove() method
//        boolean isRubyRemoved = languages.remove("Ruby");
//        System.out.println("Ruby lang is removed? " + isRubyRemoved);
//        System.out.println("HashSet: " + languages);

//--------------------------------------------------------------------------------------------------
        /* LinkedHashSet*/
//        LinkedHashSet<String> languages = new LinkedHashSet<>();
//        languages.add("Java");
//        languages.add("Python");
//        languages.add("Ruby");
//        languages.add("JavaScript");
//        languages.add("R");
//        languages.add("GO");
//        languages.add("JavaScript");
//        System.out.println("LinkedHashSet: " + languages);
// --------------------------------------------------------------------------------------------------
        /*TreeSet*/
//        TreeSet<Integer> numbers = new TreeSet<>();
//        // Using the add() method
//        numbers.add(2);
//        numbers.add(10);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(13);
//
//        System.out.println(numbers.first());
//        System.out.println(numbers.last());
//        System.out.println(numbers.headSet(10));
//        System.out.println(numbers.tailSet(10));
//        System.out.println("TreeSet: " + numbers);

        /*Using Comparable */
        // Creating a tree set with a customized comparable
//        TreeSet<Product> products = new TreeSet<>();
//
//        products.add(new Product(1, "laptop"));
//        products.add(new Product(3, "bags"));
//        products.add(new Product(2, "makeup"));
//        products.add(new Product(6, "chairs"));
//        products.add(new Product(5, "tables"));
//        System.out.println("TreeSet 1: " + products);
//
//        /*Using Comparator */
//        TreeSet<Product> products1 = new TreeSet<>(new CustomProductComparator());
//        products1.add(new Product(1, "laptop"));
//        products1.add(new Product(3, "bags"));
//        products1.add(new Product(2, "makeup"));
//        products1.add(new Product(4, "chairs"));
//        products1.add(new Product(5, "tables"));
//        System.out.println("TreeSet 2: " + products1);
// --------------------------------------------------------------------------------------------------
//        /*HashMap*/
//        // create a hashmap
//        HashMap<String, Integer> languages = new HashMap<>();
//
//        // add elements to hashmap
//        languages.put("Java", 4);
//        languages.put("JavaScript", 10);
//        languages.put("Python", 7);
//        languages.put("R", 1);
//        System.out.println(languages);
//
//        // return set view of keys using keySet()
//        System.out.println("Keys: " + languages.keySet());
////
//        // return set view of values using values()
//        System.out.println("Values: " + languages.values());
////
//        // return set view of key/value pairs using entrySet()
//        System.out.println("Key/Value mappings: " + languages.entrySet());
//
////        // replace elements
//        languages.replace("R", 3);
//        System.out.println("After replace(): " + languages);
//
//        languages.put("R", 50);
//        System.out.println("After replace(): " + languages);
//
//        // iterate through keys only
//        System.out.print("Keys: ");
//        for (String key : languages.keySet()) {
//            System.out.print(key);
//            System.out.print(", ");
//        }
////
//        // iterate through values only
//        System.out.print("\nValues: ");
//        for (Integer value : languages.values()) {
//            System.out.print(value);
//            System.out.print(", ");
//        }
////
//        // iterate through key/value entries
//        System.out.print("\nEntries: ");
//        for (Map.Entry<String, Integer> entry : languages.entrySet()) {
//            System.out.print(entry);
//            System.out.print(", ");
//        }

        /*Tree Map*/
//         Creating TreeMap of numbers
//        TreeMap<String, Integer> numbers = new TreeMap<>();
//        // add elements
//        numbers.put("two", 2);
//        numbers.put("four", 4);
//        numbers.put("six", 6);
//        numbers.put("one", 8);
//
//        System.out.println("TreeMap of languages: " + numbers);
//
//        // Using entrySet()
//        System.out.println("Key/Value mappings: " + numbers.entrySet());
////
//        // Using keySet()
//        System.out.println("Keys: " + numbers.keySet());
//
//        // Using values()
//        System.out.println("Values: " + numbers.values());
////
//        // Using the firstKey() method
//        String firstKey = numbers.firstKey();
//        System.out.println("First Key: " + firstKey);
//
//        // Using the lastKey() method
//        String lastKey = numbers.lastKey();
//        System.out.println("Last Key: " + lastKey);
//
//        // Using firstEntry() method
//        System.out.println("First Entry: " + numbers.firstEntry());
//
//        // Using the lastEntry() method
//        System.out.println("Last Entry: " + numbers.lastEntry());

        /*LinkedHashMap*/
        // Creating LinkedHashMap of languages
//        LinkedHashMap<String, Integer> languages = new LinkedHashMap<>();
//        // add Elements
//        languages.put("Java", 2);
//        languages.put("JavaScript", 9);
//        languages.put("Go", 3);
//        languages.put("Pascal", 1);
//        languages.put("Ruby", 8);
//        languages.put("R", 5);
//        System.out.println("LinkedHashMap: " + languages);

    }
}
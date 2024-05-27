package com.collection;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names1 = new LinkedList<>();
        List<String> names2 = new Vector<>();
        List<String> names3 = new Stack<>();

        // Creating an ArrayList of String type
        ArrayList<String> languages = new ArrayList<>();

        // Adding elements to the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println("ArrayList: " + languages);

        // add element on index 3
        languages.add(3, "JavaScript");
        System.out.println("ArrayList: " + languages);

        //Accessing elements from the arraylist
        String secondLang = languages.get(1);
        System.out.println("Element at index 1: " + secondLang);

        // update value of the element
        languages.set(2, "kotlin");
        System.out.println("ArrayList: " + languages);

        // remove element from index 1
         languages.remove(1);
        System.out.println("ArrayList after removing element: " + languages);

        //get Size of array
        System.out.println(languages.size());

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}

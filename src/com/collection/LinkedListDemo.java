package com.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        /*Linked List*/
        // Creating list using the LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(6);
        numbers.add(9);
        numbers.add(3);
        numbers.add(3, 5);
        System.out.println("List: " + numbers);

        // add() method with the index parameter
        numbers.add(3, 50);
        System.out.println("Updated LinkedList: " + numbers);

        // Access element from the list
        int number = numbers.get(1);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(9);
        System.out.println("Position of 9 is " + index);

        // change elements at index 3
        numbers.set(3, 100);
        System.out.println("changed LinkedList: " + numbers);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);

        //get size
        System.out.println("List Size: " + numbers.size());

        /*LinkedList as Queue*/
        Queue<String> names = new LinkedList<>();

        // add elements
        names.add("Ahmed");
        names.add("Mohamed");
        names.add("Mahmoud");
        System.out.println("LinkedList: " + names);

        // access the first element
        String str1 = names.peek();
        System.out.println("Accessed Element: " + str1);

        // access and remove the first element
        String str2 = names.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + names);

        /*LinkedList as Deque*/
        Deque<String> namesDeque = new LinkedList<>();
        Deque<Integer> names1 = new LinkedList<>();

        // add element at the beginning
        namesDeque.add("Ahmed");
        System.out.println("LinkedList: " + names);

        namesDeque.addFirst("Mohamed");
        System.out.println("LinkedList after addFirst(): " + names);

        // add elements at the end
        namesDeque.addLast("Mahmoud");
        System.out.println("LinkedList after addLast(): " + names);

        // remove the first element
        namesDeque.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + names);

        // remove the last element
        namesDeque.removeLast();
        System.out.println("LinkedList after removeLast(): " + names);

        System.out.println("LinkedList with pop " + namesDeque.pop());
    }
}

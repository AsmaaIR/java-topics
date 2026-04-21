package com.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedList demo ===");

        System.out.println("\n-- 1) Creating list using the LinkedList class --");
        List<Integer> numbers = new LinkedList<>();
        numbers.add(6);
        numbers.add(9);
        numbers.add(3);
        numbers.add(3, 5);
        System.out.println("numbers = " + numbers);

        // add() method with the index parameter
        numbers.add(3, 50);
        System.out.println("after add(3, 50): " + numbers);

        // Access element from the list
        int second = numbers.get(1);
        System.out.println("get(1) = " + second);

        int indexOf9 = numbers.indexOf(9);
        System.out.println("indexOf(9) = " + indexOf9);

        // change elements at index 3
        numbers.set(3, 100);
        System.out.println("after set(3, 100): " + numbers);

        // Remove element from the list
        int removed = numbers.remove(1);
        System.out.println("remove(1) removed: " + removed);
        System.out.println("numbers = " + numbers);

        //get size
        System.out.println("size = " + numbers.size());

        System.out.println("\n-- 2) LinkedList used as Queue (FIFO) --");
        Queue<String> queue = new LinkedList<>();
        queue.add("Ahmed");
        queue.add("Mohamed");
        queue.add("Mahmoud");
        System.out.println("queue = " + queue);
        System.out.println("peek() = " + queue.peek());
        System.out.println("poll() = " + queue.poll());
        System.out.println("after poll(): " + queue);

        System.out.println("\n-- 3) LinkedList used as Deque (double-ended queue) --");
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("B");
        deque.addLast("C");
        deque.addFirst("A");
        System.out.println("deque = " + deque);
        System.out.println("removeFirst() = " + deque.removeFirst());
        System.out.println("removeLast() = " + deque.removeLast());
        System.out.println("deque = " + deque);

        System.out.println("\n-- 4) Stack-like operations (LIFO) using Deque --");
        deque.push("first");
        deque.push("second");
        System.out.println("after push: " + deque);
        System.out.println("pop() = " + deque.pop());
        System.out.println("after pop: " + deque);
    }
}

package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	public  static void main(String[] args) {
		// Deque is a double-ended queue that allows insertion and removal of elements from both ends.
		// It can be used as a stack or a queue.
		Deque<String> deque = new LinkedList<>();

		// Adding elements to the deque
		deque.add("Java");
		deque.add("C++");
		deque.addFirst("Python");
		deque.addLast("JavaScript");
		System.out.println("Deque after adding elements: " + deque);

		// Accessing elements
		String firstElement = deque.getFirst();
		String lastElement = deque.getLast();
		System.out.println("First element: " + firstElement);
		System.out.println("Last element: " + lastElement);

		// Removing elements
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing elements: " + deque);


	}
}

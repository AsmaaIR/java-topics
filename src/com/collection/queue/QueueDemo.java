package com.collection.queue;

import java.util.*;

public class QueueDemo {
	public  static void main(String[] args) {
		// Queue is a data structure that follows the First In First Out (FIFO) principle.
		// It allows insertion of elements at the end and removal from the front.
		Queue<String> queue = new LinkedList<>();

		// Adding elements to the queue
		queue.add("Java");
		queue.add("Python");
		queue.add("JavaScript");
		System.out.println("Queue after adding elements: " + queue);

		// Accessing elements
		String firstElement = queue.peek();
		System.out.println("First element: " + firstElement);

		// Removing elements
		String removedElement = queue.poll();
		System.out.println("Removed element: " + removedElement);
		System.out.println("Queue after removing an element: " + queue);

		// Checking if the queue is empty
		boolean isEmpty = queue.isEmpty();
		System.out.println("Is the queue empty? " + isEmpty);

		// Getting the size of the queue
		int size = queue.size();
		System.out.println("Size of the queue: " + size);

		// Iterating through the queue
		System.out.println("Iterating through the queue:");
		for (String element : queue) {
			System.out.println(element);
		}

		// Clearing the queue
		queue.clear();
		System.out.println("Queue after clearing: " + queue);
		System.out.println("Is the queue empty after clearing? " + queue.isEmpty());
		System.out.println("Size of the queue after clearing: " + queue.size());


		// Note: The Queue interface does not allow null elements.
		// Attempting to add a null element will throw a NullPointerException.
		// queue.add(null); // Uncommenting this line will throw an exception


	}
}

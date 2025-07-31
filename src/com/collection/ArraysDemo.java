package com.collection;

// 1
public class ArraysDemo {
	public static void main(String[] args) {
		// Declare an array of integers, Memory is not allocated for elements yet
		int[] numbers;

		// Initialization, memory is allocated for 5 integers
		numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println(numbers.length);


		// you can declare and initialize at the same time
		int[] numbers1 = new int[10]; //way1
		int[] nums = {10, 20, 30, 40, 50}; //way2

		System.out.println(numbers1.length);
		System.out.println(nums.length);

		// Modify an element
		nums[2] = 60;
		System.out.println(nums[2]);
//        numbers[5]=2; // will throw ArrayIndexOutOfBoundsException


		// Traversing an Array
		// 1- Using a for loop to print all elements in the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}

		// Using an enhanced for-loop (for-each loop)
		for (int number : numbers) {
			System.out.println("Number: " + number);
		}
	}
}

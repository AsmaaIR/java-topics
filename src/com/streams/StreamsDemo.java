package com.streams;

import com.java8.Item;
import com.java8.Order;
import com.java8.OrderRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

		//filter even numbers and return in a new list
		List<Integer> evenNumbers = nums.stream()
				.filter(num -> num % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);

		//filter even numbers and return in a new list
		Set<Integer> evenNumbersWithoutDuplicates = nums.stream()
				.filter(num -> num % 2 == 0)
				.collect(Collectors.toSet());
		System.out.println(evenNumbersWithoutDuplicates);

		//double the even number and get total
		int sumOfEvenNumbersUsingForLoop = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				sumOfEvenNumbersUsingForLoop += nums.get(i);
			}
		}
		System.out.println(sumOfEvenNumbersUsingForLoop);

		//double the even number and get total using stream
		int sumOfEvenNumbersUsingStream = nums.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * 2)
				.reduce(0, (total, num) -> total + num);
		System.out.println(sumOfEvenNumbersUsingStream);

		//double the even number and get total with intstream
		int sumOfEvenNumbersUsingIntStream = nums.stream()
				.filter(num -> num % 2 == 0)
				.map(num -> num * 2)
				.mapToInt(num -> num)
				.sum();
		System.out.println(sumOfEvenNumbersUsingIntStream);


		//count of even numbers
		long evenNumbersCount = nums.stream()
				.filter(num -> num % 2 == 0)
				.count();
		System.out.println(evenNumbersCount);


		//first number greater than 3 if none found return 0
		int result = nums.stream()
				.filter(num -> num > 3 && num % 2 == 0)
				.findFirst()
				.orElse(0);
		System.out.println(result);


		OrderRepository orderRepository = new OrderRepository();
		List<Order> orders = orderRepository.findAll();

		//cearte Hashmap with id as key and items as value
		Map<Integer, List<Item>> map = orders.stream()
				.collect(Collectors.toMap(order -> order.getId(), order -> order.getItems()));
		System.out.println(map);


		//get List Of All orders items
		List<Item> items = orders.stream()
				.flatMap(order -> order.getItems().stream())
				.collect(Collectors.toList());
		System.out.println(items);


		//streams are lazy these intermediate operations will not be executed until we add terminal operations
		Stream<Integer> evenNumbersDoubledStream = nums.stream()
				.filter(num -> isEven(num))
				.map(number -> doubleInt(number));
//        evenNumbersDoubledStream.collect(Collectors.toList());
	}


	public static boolean isEven(Integer num) {
		System.out.println(num + " isEven is executing");
		return num % 2 == 0;
	}

	public static Integer doubleInt(Integer num) {
		System.out.println(num + " doubleInt is executing");
		return num * 2;
	}
}

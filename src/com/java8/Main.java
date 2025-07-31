package com.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        functionalInterfaceAndLambdaExpression();

        forEach();

        optional();

    }

    private static void functionalInterfaceAndLambdaExpression() {

        //normal flow -> create class implements the object and instaniating from class
        ExampleInterface ex = new ExampleClasss();
        ex.exampleMethod("from concrete class");

        //anonymous class
        ExampleInterface ex2 = new ExampleInterface() {
            @Override
            public void exampleMethod(String msg) {
                System.out.println(msg);
            }
        };
        ex2.exampleMethod("from anonymous class");

        //lamda expression
        ExampleInterface ex3 = msg -> System.out.println(msg);
        ex3.exampleMethod("from lamda expression");

        //lamda expression with method refernce
        ExampleInterface ex4 = System.out::println;
        ex4.exampleMethod("from lamda expression");

        ExampleInterface ex5 = ExampleInterface::staticMethod;

        ExampleInterface ex6 = String::format;

        Thread thread = new Thread(() -> System.out.println("in thread"));

        //there are some ready functional interfaces in java
        //consumer takes argument and returns nothing
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("consumed value");

        //supplir takes no argument but gives a value
        Supplier<String> supplier = () -> "supplied value";
        System.out.println(supplier.get());

        //predicate takes a parameter and returns a boolean
        Predicate<String> predicate = x -> x.length() == 10;
        System.out.println(predicate.test("test value"));

        //function takes a parameter and returns a value
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("test string"));
    }

    private static void forEach() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        //normal for loop
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //enhanced for loop
        for(Integer num : nums) {
            System.out.println(num);
        }

        //foreach method is now present in Iterable interface which is extended by collection interface
        nums.forEach(x -> System.out.println(x));
    }

    private static void optional() {
        OrderRepository orderRepository = new OrderRepository();

//        Order order = orderRepository.findOrderById(19);
//        System.out.println(order.getCustomerName());    //NullPointerException
//
        Optional<Order> orderOptional = orderRepository.findOrderByIdWithOptional(19);
        if(orderOptional.isPresent()) {
            System.out.println(orderOptional.get().getItems());
        }

        //you can give some operation to be done if order is present
        orderOptional.ifPresent( x -> System.out.println(x.getId()) );

        //you can give a default value to use if order is not present
        Order order = orderRepository.findOrderByIdWithOptional(19).orElse(new Order());

        //you can throw an exception if item is not present
        Order order2 = orderRepository.findOrderByIdWithOptional(19).orElseThrow(() -> new RuntimeException("item not found"));
    }




}
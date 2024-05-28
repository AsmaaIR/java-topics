package com.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        // Using the add() method
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(4);
        numbers.add(13);

        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.headSet(10));
        System.out.println(numbers.tailSet(10));
        System.out.println("TreeSet: " + numbers);

        /*Using Comparable */
//         Creating a tree set with a customized comparable
        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(1, "laptop"));
        products.add(new Product(3, "bags"));
        products.add(new Product(2, "makeup"));
        products.add(new Product(6, "chairs"));
        products.add(new Product(5, "tables"));
        System.out.println("TreeSet 1: " + products);

        /*Using Comparator */
        TreeSet<Product> products1 = new TreeSet<>(new CustomProductComparator());
        products1.add(new Product(1, "laptop"));
        products1.add(new Product(3, "bags"));
        products1.add(new Product(2, "makeup"));
        products1.add(new Product(4, "chairs"));
        products1.add(new Product(5, "tables"));
        System.out.println("TreeSet 2: " + products1);
    }
}

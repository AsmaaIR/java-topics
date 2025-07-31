package com.collection.set.treeset;

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
        // This will use the compareTo method defined in Product class
        // if the product class not implements Comparable, it will throw ClassCastException
        // because TreeSet will not know how to compare the objects of Product class.
        // In this case, we are sorting the products by id in descending order
        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(1, "laptop"));
        products.add(new Product(3, "bags"));
        products.add(new Product(2, "makeup"));
        products.add(new Product(6, "chairs"));
        products.add(new Product(5, "tables"));
        System.out.println("TreeSet 1: " + products);

        /*Using Comparator */

//        TreeSet<Product> products1 = new TreeSet<>(new CustomProductComparator());

        // using lambda expression to sort by name in descending order
        // This will override the natural ordering defined in Product class
        // and sort the products by name in descending order
        // Note: If you use this, the compareTo method in Product class will not be used.
        TreeSet<Product> products1 = new TreeSet<>(
                (p1, p2) -> p2.getName().compareTo(p1.getName())
        );
        products1.add(new Product(1, "laptop"));
        products1.add(new Product(3, "bags"));
        products1.add(new Product(2, "makeup"));
        products1.add(new Product(4, "chairs"));
        products1.add(new Product(5, "tables"));
        System.out.println("TreeSet 2: " + products1);
    }
}

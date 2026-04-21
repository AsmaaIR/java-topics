package com.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        System.out.println("=== TreeSet demo ===");

        System.out.println("\n-- 1) TreeSet<Integer> (sorted ascending) --");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(4);
        numbers.add(13);
        numbers.add(10); // duplicate ignored

        System.out.println("numbers = " + numbers);
        System.out.println("first() = " + numbers.first());
        System.out.println("last()  = " + numbers.last());
        System.out.println("headSet(10) = " + numbers.headSet(10));
        System.out.println("tailSet(10) = " + numbers.tailSet(10));
        System.out.println("contains(4) = " + numbers.contains(4));
        System.out.println("higher(4) = " + numbers.higher(4));
        System.out.println("lower(4)  = " + numbers.lower(4));

        System.out.println("\n-- 2) TreeSet<Product> using Comparable (natural order) --");
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product(1, "laptop"));
        products.add(new Product(3, "bags"));
        products.add(new Product(2, "makeup"));
        products.add(new Product(6, "chairs"));
        products.add(new Product(5, "tables"));
        System.out.println("products (by id asc) = " + products);

        System.out.println("\n-- 3) TreeSet<Product> using Comparator (custom order) --");
        TreeSet<Product> products1 = new TreeSet<>(new CustomProductComparator());
        products1.add(new Product(1, "laptop"));
        products1.add(new Product(3, "bags"));
        products1.add(new Product(2, "makeup"));
        products1.add(new Product(4, "chairs"));
        products1.add(new Product(5, "tables"));
        System.out.println("products (by id desc) = " + products1);
    }
}

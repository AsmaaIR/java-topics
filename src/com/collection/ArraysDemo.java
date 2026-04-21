package com.collection;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        System.out.println("=== Arrays demo ===");

        System.out.println("\n-- 1) Declaration vs initialization --");
        int[] numbers; // declared (reference exists), elements not allocated yet

        numbers = new int[5]; // initialized (5 ints allocated), default values are 0
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("numbers defaults = " + Arrays.toString(numbers));

        System.out.println("\n-- 2) Assign by index --");
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("\n-- 3) Inline initialization --");
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("\n-- 4) Read / write by index --");
        System.out.println("nums[2] (before) = " + nums[2]);
        nums[2] = 60;
        System.out.println("nums[2] (after)  = " + nums[2]);

        // numbers[5]=2; // will throw ArrayIndexOutOfBoundsException

        System.out.println("\n-- 5) Traversal --");
        System.out.println("for-loop (index + value):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + " -> " + numbers[i]);
        }

        System.out.println("enhanced for-loop (values only):");
        for (int value : numbers) {
            System.out.println("value -> " + value);
        }

        System.out.println("\n-- 6) Common utilities (java.util.Arrays) --");
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("copy = " + Arrays.toString(copy));

        Arrays.sort(copy);
        System.out.println("sorted copy = " + Arrays.toString(copy));

        int indexOf40 = Arrays.binarySearch(copy, 40);
        System.out.println("binarySearch(40) = " + indexOf40);

        // Note: arrays are fixed-size. If you need resizing, prefer ArrayList.
    }
}

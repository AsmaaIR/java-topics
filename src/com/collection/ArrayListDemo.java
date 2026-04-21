package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayList demo ===");

        List<String> languages = new ArrayList<>();

        System.out.println("\n-- 1) Add / size / isEmpty --");
        System.out.println("Initially empty? " + languages.isEmpty());
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println("languages = " + languages);
        System.out.println("size = " + languages.size());

        System.out.println("\n-- 2) Add at index (shifts to the right) --");
        languages.add(1, "JavaScript");
        System.out.println("languages = " + languages);

        System.out.println("\n-- 3) Get / set --");
        String second = languages.get(1);
        System.out.println("get(1) = " + second);
        languages.set(2, "Kotlin");
        System.out.println("after set(2, Kotlin): " + languages);

        System.out.println("\n-- 4) contains / indexOf / lastIndexOf --");
        System.out.println("contains(\"Ruby\") = " + languages.contains("Ruby"));
        languages.add("Java");
        System.out.println("after adding duplicate \"Java\": " + languages);
        System.out.println("indexOf(\"Java\") = " + languages.indexOf("Java"));
        System.out.println("lastIndexOf(\"Java\") = " + languages.lastIndexOf("Java"));

        System.out.println("\n-- 5) Remove by index vs remove by value --");
        String removedAt0 = languages.remove(0);
        System.out.println("remove(0) removed: " + removedAt0);
        boolean removedRuby = languages.remove("Ruby");
        System.out.println("remove(\"Ruby\") success? " + removedRuby);
        System.out.println("languages = " + languages);

        System.out.println("\n-- 6) Iterate (for-each) --");
        for (String lang : languages) {
            System.out.println("- " + lang);
        }

        System.out.println("\n-- 7) Iterate (Iterator) + safe remove while iterating --");
        Iterator<String> it = languages.iterator();
        while (it.hasNext()) {
            String lang = it.next();
            if (lang.equalsIgnoreCase("python")) {
                it.remove();
            }
        }
        System.out.println("after removing \"Python\" via iterator: " + languages);

        System.out.println("\n-- 8) Iterate backwards (ListIterator) --");
        ListIterator<String> listIt = languages.listIterator(languages.size());
        while (listIt.hasPrevious()) {
            System.out.println("<- " + listIt.previous());
        }

        System.out.println("\n-- 9) toArray / copy / bulk ops --");
        String[] array = languages.toArray(new String[0]);
        System.out.println("toArray = " + Arrays.toString(array));

        List<String> more = Arrays.asList("Go", "Rust", "Java");
        languages.addAll(more);
        System.out.println("after addAll([Go, Rust, Java]): " + languages);

        languages.retainAll(Arrays.asList("Java", "Go"));
        System.out.println("after retainAll([Java, Go]) (keep only): " + languages);
    }
}

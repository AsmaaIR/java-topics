package com.collection.set.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public  static void main(String[] args) {
		HashSet<String> languages = new HashSet<>();
		// Using add() method
		languages.add("Java");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("JavaScript");
		languages.add("R");
		languages.add("GO");
		languages.add("JavaScript");
		System.out.println("HashSet: " + languages);
		// Using remove() method
		boolean isRubyRemoved = languages.remove("Ruby");
		System.out.println("Ruby lang is removed? " + isRubyRemoved);
		System.out.println("HashSet: " + languages);
	}
}

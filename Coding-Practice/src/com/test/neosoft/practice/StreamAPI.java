package com.test.neosoft.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {

	// java8 stream API

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		// Find the list of even no's from given list
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// Given a list of integers, find out all the numbers starting with 1
		list.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("1")).forEach(System.out::println);

		// find duplicate elements in a given integers list in java
		Set<Integer> set = new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		// Given the list of integers, find the first element of the list
		list.stream().findFirst().ifPresent(System.out::println);

		// Given a list of integers, find the total number of elements present in the
		// list
		long count = list.stream().count();
		System.out.println(count);

		// find the maximum value element present
		list.stream().max(Integer::compare).get();

		// Given a String, find the first non-repeated character
		String input = "Java Hungry Blog Alive is Awesome";

		Character result = input.chars() // Stream of String
				// First convert to Character object and then to lowercase
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
				// Store count
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);
	}

}

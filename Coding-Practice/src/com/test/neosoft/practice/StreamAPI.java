package com.test.neosoft.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	// java8 stream API

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
//
//		// Find the list of even no's from given list ( filter )
//		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//
//		// find duplicate elements in a given integers list in java
//		Set<Integer> set = new HashSet<>();
//		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
//		
//		// Given a list of integers, find out all the numbers starting with 1
//		list.stream().map(s -> s + "") // Convert integer to String ( map operation )
//				.filter(s -> s.startsWith("1")).forEach(System.out::println);
//		
//		// Given a list of integers, convert to list of strings (map convert one object to another)
//		list.stream().map(String::valueOf).collect(Collectors.toList());
//
//		// Given a list of list convert them in a single list ( flatmap )
//		List<Integer> list1 = Arrays.asList(1, 11, 111);
//		List<Integer> list2 = Arrays.asList(2, 22, 222);
//		List<List<Integer>> list = new ArrayList<>();
//		list.add(list1);
//		list.add(list2);
//		List<Integer> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		//Sort the list of string without comparator and with comparator  ( Sorted operation )
//		List<String> names =  Arrays.asList("ritik", "suraj", "samrat", "shivam");
//		List<String> ascNames = names.stream().sorted().collect(Collectors.toList());
//		List<String> descNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(ascNames);
//		System.out.println(descNames);
//		
//		// Given a list of integers perform multiplication on the list. ( Reduce operation ) 
//		List<Integer> list = Arrays.asList(10, 10, 10);
//		Optional<Integer> product = list.stream().reduce((a,b) -> a*b);
//		System.out.println(product.isPresent() ? product.get() : "Empty");
//		
		Optional<String> reduce = list.stream().filter(s -> s%2 == 0).map(String::valueOf).reduce((a,b) -> a + b);
		System.out.println(reduce.isPresent() ? reduce.get() : "Empty");
		
//		//Given a list of integers find the largest element  
//		List<Integer> list = Arrays.asList(10,20,10,55,30,45);
//		Optional<Integer> greater = list.stream().reduce((s1,s2) -> s1 > s2 ? s1 : s2);
//		System.out.println(greater.isPresent()? greater.get() : "No greatest element Found Error Occured.");
//		
//		// Given the list of integers, find the first element of the list
//		list.stream().findFirst().ifPresent(System.out::println);
//
//		// Given a list of integers, find the total number of elements present in the list
//		long count = list.stream().distinct().count();
//		System.out.println(count);
//
//		// find the maximum value element present
//		list.stream().max(Integer::compare).get();
//
//		// Given a String, find the first non-repeated character
//		String input = "Java Hungry Blog Alive is Awesome";
//
//		Character result = input.chars() // Stream of String
//				// First convert to Character object and then to lowercase
//				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//				// Store count
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
//				.get();
//		System.out.println(result);
//		
//		//Given a String, find the first repeated character in it
//		 String input = "Java Hungry Blog Alive is Awesome";
//
//         Character result = input.chars() // Stream of String       
//                                 .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
//                                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
//                                 .entrySet()
//                                 .stream()
//                                 .filter(entry -> entry.getValue() > 1L)
//                                 .map(entry -> entry.getKey())
//                                 .findFirst()
//                                 .get();
//			System.out.println(result);
//		
//		//Given a list of integers, sort all the values present in it ( Print in forEach style )
//		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//
//         myList.stream()
//               .sorted()
//               .forEach(System.out::println);
		
		}

}

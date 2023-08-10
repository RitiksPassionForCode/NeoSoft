package com.test.neosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.neosoft.practice.Address;
import com.test.neosoft.practice.DepartmentCloneable;
import com.test.neosoft.practice.Employee;
import com.test.neosoft.practice.MarksDeepCopyCloneable;
import com.test.neosoft.practice.Singleton;

public class TestMain {
	
//	// Method for factorial recursion
//	public static int recusrsion(int num) {
//		if(num == 0) {
//			return 1;
//		} else {
//			return num * recusrsion(num-1);
//		}
//		
//	}

	public static void main(String[] args) {
		
		//Preperation Questions for TCL Uncomment each section for output

//		//Secound Largest no in array
//		int [] array = new int[] {1,2,3,4};
//		int asInt = Arrays.stream(array).sorted().skip(array.length-2).findFirst().getAsInt();
//		System.out.println(asInt);
//		----------------------------------------------
//		
//		//Counct character occurences
//		char [] charArray = {'a','b','b','c','d'};
//		String str = new String(charArray);
//		Map<Character, Long> collect = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		collect.entrySet().forEach(s -> System.out.println(s.getKey()+":"+ s.getValue()));
//		-----------------------------------------------
//		
//		//Duplicate in array
//		final HashSet<Integer> seen = new HashSet<>();
//		int[] arr = {16,19,19,21,25,21,5,8,10,25};
//		int duplicate = Arrays.stream(arr).filter(s -> !seen.add(s)).findFirst().getAsInt();
//		System.out.println(duplicate);
//		-----------------------------------------------
//
//		//Filter with if/else
//		List<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(1);
//		list.add(4);
//		list.add(7);
//		
//		list.stream().filter(s -> {
//			if(s%2 == 0) {
//				return true;
//			}else {
//				return false;
//			}
//		}).forEach(s -> System.out.println(s));
//      -----------------------------------------------
//		
//		 //Segregate fruits and vegetables from basket
//		String[][] basket = { { "FRT", "Apple" }, { "VG", "Onion" }, { "VG", "Potato" }, { "VG", "Chillies" },
//				{ "FRT", "Mango" }, { "FRT", "Banana" } };
//
//		String[][] priceperKG = { { "200", "Apple" }, { "20", "Onion" }, { "20", "Potato" }, { "80", "Chillies" },
//				{ "450", "Mango" }, { "50", "Banana" }, { "30", "Watermellon" }, { "50", "Grapes" } };
//
//		List<String> fruits = new ArrayList<>();
//		List<String> vegetables = new ArrayList<>();
//		
//		int i = 0;		
//		for (String[] items : basket) {
//			if("FRT".equals(items[i])) {
//				fruits.add(items[i+1]);
//			} else {
//				vegetables.add(items[i+1]);
//			}
//		}
//		
//		int no =  1;
//		System.out.println("Avaliable Fruits with price value :");
//		for (String[] items : priceperKG) {
//			for(String frt : fruits) {
//				if(Objects.equals(frt, items[i+1])) {
//					System.out.println(no +" "+items[i+1]+" "+items[i]+"/Kg");
//					no++;
//				}				
//			}
//		}
//		
//		no = 1;
//		System.out.println("Avaliable Vegetables with price value :");
//		for (String[] items : priceperKG) {
//			for(String vgt : vegetables) {
//				if(Objects.equals(vgt, items[i+1])) {
//					System.out.println(no +" "+items[i+1]+" "+items[i]+"/Kg");
//					no++;
//				}				
//			}
//		}		
//      -------------------------------------------------------
//		
//		//reverse the string
//		String name = "ritik";
//		String result = "";
//		for(int i = name.length()-1; i>=0; i--) {
//			result = result + name.charAt(i);
//		}
//		System.out.println(result);
//		-------------------------------------------------------
//		
//		//fabbonacci series without recursion
//		int first = 0;
//		int second = 1;
//		int count = 15;
//		System.out.print(first + " " + second);
//		for(int i=0; i<count; i++) {
//			int third = first + second;
//			System.out.print(" " + third);
//			first = second;
//			second = third;
//		}
//      -------------------------------------------------------
//		
//		//factorial with recursion
//		int result = recusrsion(2);
//		System.out.println(result);
//		------------------------------------------------------
//		
//		//Add no less then 15 to end of list
//		List<Integer> asList = new ArrayList<>(Arrays.asList(10,23,90,78,90,12,10));
//		List<Integer> smallThanFifteen = asList.stream().filter(s-> s <= 15).collect(Collectors.toList());
//		List<Integer> greater = asList.stream().filter(s -> s > 15).collect(Collectors.toList());
//		greater.addAll(smallThanFifteen);
//		System.out.println(greater);
//		-------------------------------------------------------	
//
//		//Shallow Copy
//		try {
//			DepartmentCloneable.test();
//		} catch (CloneNotSupportedException e) {
//			System.out.println("error");
//			e.printStackTrace();
//		}
//		
//		//Deep Copy
//		try {
//			MarksDeepCopyCloneable.test();
//		} catch (CloneNotSupportedException e) {
//			System.out.println("error");
//			e.printStackTrace();
//		}
//      ------------------------------------------------------------------	
		
//		// Breaks Immutability
//		Address address = new Address("street 1", "city X");
//		List<String> phoneNumbers = new ArrayList<>();
//		phoneNumbers.add("123456");
//		phoneNumbers.add("456789");
//		Map<String, String> metadata = new HashMap<>();
//		metadata.put("hobby", "Watching Movies");
//		// Declare the employee
//		Employee e = new Employee("John", 23, address, phoneNumbers, metadata);
//		
//		// if Update details
//		e.getPhoneNumbers().add("345123");
//		e.getMetadata().put("skill", "Java");
//		e.getMetadata().put("designation", "HR");
//
//		System.out.println(e.getPhoneNumbers());
//		System.out.println(e.getMetadata());
//		
//		// also if Delete Details
//		
//		e.getMetadata().remove("hobby");
//		e.getPhoneNumbers().remove("123456");
//		
//		//if defined setters
//		e.getAddress().setCity("c3");
//		e.getAddress().setStreet("s3");
		
		
//		//Not able to break Immutability returns original object
//		Address address = new Address("street 1", "city X");
//		List<String> phoneNumbers = new ArrayList<>();
//		phoneNumbers.add("123456");
//		phoneNumbers.add("456789");
//		Map<String, String> metadata = new HashMap<>();
//		metadata.put("hobby", "Watching Movies");
//
//		// Declare the employee
//		Employee e = new Employee("John", 23, address, phoneNumbers, metadata);
//
//		// Update details
//		e.getPhoneNumbers().add("345123");
//		e.getMetadata().put("skill", "Java");
//		e.getMetadata().put("designation", "HR");
//
//		// change address details
//		e.getAddress().setCity("c3");
//		e.getAddress().setStreet("s3");
//
//		System.out.println(e.getPhoneNumbers());
//		System.out.println(e.getMetadata());
//		System.out.println(e.getAddress());
		
//		Singleton instance = Singleton.getInstance();
//		Singleton instance2 = Singleton.getInstance();
//		System.out.println(instance);
//		System.out.println(instance2);
//		Singleton.getSingelton();
//		----------------------------------------------------------------------
				
	}

}

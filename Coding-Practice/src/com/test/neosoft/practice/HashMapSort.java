package com.test.neosoft.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSort {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "Ritik");
		map.put("2", "Ajay");
		map.put("3", "Raviraj");
		
		List<Map.Entry<String,String>> listMap = new ArrayList<>(map.entrySet());
		
		Collections.sort(listMap, (entry1,entry2) -> entry1.getValue().compareTo(entry2.getValue()));
		 
		for(Entry<String, String> e : listMap) {
			System.out.println(e);
		}

	}

}

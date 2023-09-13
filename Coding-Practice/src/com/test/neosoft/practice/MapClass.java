package com.test.neosoft.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapClass {
	
	static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            int firstnameComparison = student1.getFirstName().compareTo(student2.getFirstName());
            if (firstnameComparison != 0) {
                // If firstnames are different, use firstname for comparison
                return firstnameComparison;
            } else {
                // If firstnames are the same, use lastname for comparison
                return student1.getLastName().compareTo(student2.getLastName());
            }
        }
    }

	public static void main (String [] args) {
		
		Map<String, Student> mapStudent = new HashMap<>();
		mapStudent.put("1", new Student("Ritik", "Choudhary"));
		mapStudent.put("2", new Student("Rajat", "Malviya"));
		mapStudent.put("3", new Student("Raviraj", "Verma"));
		mapStudent.put("4", new Student("Sidheswar", "kapoor"));
		mapStudent.put("5", new Student("Ritik", "Verma"));
		
		//remove duplicate values
//		Map<Student, String> uniqueValues = new HashMap<>();
//        Map<String, Student> resultMap = new LinkedHashMap<>();
//        
//        for (Map.Entry<String, Student> entry : mapStudent.entrySet()) {
//            Student value = entry.getValue();
//            
//            // Check if the value has been seen before
//            if (!uniqueValues.containsKey(value)) {
//                uniqueValues.put(value, entry.getKey());
//                resultMap.put(entry.getKey(), value);
//            }
//        }
//        System.out.println(resultMap);
		
		//sort by value 
//		LinkedHashMap<Object, Object> collect = mapStudent.entrySet().stream().distinct()
//        .sorted(Map.Entry.comparingByValue(new StudentComparator()))
//        .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
//		
//		System.out.println(collect.toString());
    }
	
	

}

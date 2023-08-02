package com.test.neosoft.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Make the class Final so that it cannot be extended.
public final class Employee {

	// Make all fields private so that direct access is prohibited.
	private final String empName;
	private final int age;
	private final Address address;
	private final List<String> phoneNumbers;
	private final Map<String, String> metadata;

	// Using deep copy, invoke all fields by constructors.
	public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
		super();
		this.empName = name;
		this.age = age;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.metadata = metadata;
	}

	// Don't provide variable setter methods.
	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

//	public Address getAddress() {
//		return address;
//	}
	
	  // clone the address object
    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

	// This still can break Immutability
//	public List<String> getPhoneNumbers() {
//		return phoneNumbers;
//	}
//
//	public Map<String, String> getMetadata() {
//		return metadata;
//	}
	
	// solution
	// Take a copy of the existing data assigned using constructor and return as a new object. 
	// Then whenever you call GETTERS, you will get the old data. Not the updated ones.
	
	// copy the list of phone numbers
    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    // copy the map of metadata
    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }
}

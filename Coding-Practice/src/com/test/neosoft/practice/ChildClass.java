package com.test.neosoft.practice;

public class ChildClass extends ParentClass {

	@Override
	public String getProperty() {
		String bangalowproperty = super.getProperty();
		return "Car" + bangalowproperty;
	}
	
	public static void main(String [] args) {
		
		ParentClass p = new ChildClass();
		String property = p.getProperty();
		System.out.println(property);
	}
}

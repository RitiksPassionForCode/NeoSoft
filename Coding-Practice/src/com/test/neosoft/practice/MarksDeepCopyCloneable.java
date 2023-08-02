package com.test.neosoft.practice;

public class MarksDeepCopyCloneable implements Cloneable {

	int a;
	int b;
	Marks marks = new Marks();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		MarksDeepCopyCloneable marksDeepCopyCloneable = (MarksDeepCopyCloneable) super.clone();
		marksDeepCopyCloneable.marks = new Marks();
		return marksDeepCopyCloneable;
	}
	
	public static void test() throws CloneNotSupportedException {
		MarksDeepCopyCloneable marksDeepCopyCloneable = new MarksDeepCopyCloneable();
		marksDeepCopyCloneable.a = 500;
		marksDeepCopyCloneable.b = 200;
		marksDeepCopyCloneable.marks.x = 70;
		marksDeepCopyCloneable.marks.y = 80;
	    
	    // Creating a cloned instance of MarksDeepCopyCloneable and modifying its fields
	    MarksDeepCopyCloneable marksDeepCopyCloneable2 = (MarksDeepCopyCloneable) marksDeepCopyCloneable.clone();
	    marksDeepCopyCloneable2.a = 100;
	    marksDeepCopyCloneable2.marks.x = 500;
	    
	    // Printing the values of fields for both instances
	    System.out.println(marksDeepCopyCloneable.a + " " + marksDeepCopyCloneable.b + " " + marksDeepCopyCloneable.marks.x + " " + marksDeepCopyCloneable.marks.y);
	    System.out.println(marksDeepCopyCloneable2.a + " " + marksDeepCopyCloneable2.b + " " + marksDeepCopyCloneable2.marks.x + " " + marksDeepCopyCloneable2.marks.y);
	}
}

package com.test.neosoft.practice;

public class GrabageCollector {

	// to store object name
	String obj_name;

	public GrabageCollector(String obj_name) {
		this.obj_name = obj_name;
	}

	static void show() {
		// object g1 inside method becomes unreachable when show() removed
		GrabageCollector g1 = new GrabageCollector("g1");
		display();

	}

	static void display() {
		// object g2 inside method becomes unreachable when display() removed
		GrabageCollector g2 = new GrabageCollector("g2");
	}

//	// Driver method
//	public static void main(String args[]) {
//
//		// When a method is called it goes inside the stack frame. When the method is
//		// popped from the stack,
//		// all its members dies and if some objects were created inside it then these
//		// objects becomes unreachable
//		// or anonymous after method execution and thus becomes eligible for garbage
//		// collection
//
//		// calling show()
//		show();
//
//		// calling garbage collector
//		System.gc();
//	}

//	public static void main(String [] args) {
//		// When reference id of one object is referenced to reference id of some other
//		// object then
//		// the previous object has no any longer reference to it and becomes unreachable
//		// and thus
//		// becomes eligible for garbage collection.
//
//		// Reassigning the reference variable
//		GrabageCollector g1 = new GrabageCollector("g1");
//		GrabageCollector g2 = new GrabageCollector("g2");
//
//		// t1 now referred to t2
//		g1 = g2;
//
//		// calling garbage collector
//		System.gc();
//	}
	
//	public static void main(String [] args) {
//		
//		//When all the reference variables of an object are changed to NULL, it becomes unreachable 
//		//and thus becomes eligible for garbage collection.
//		
//		//Nullifying the reference variable
//		GrabageCollector g1 = new GrabageCollector("g1");
//   
//        /* When there is no more use of g1, make the object
//           referred by g1 eligible for garbage collection */        
//        g1 = null;
//   
//        // calling garbage collector
//        System.gc();
//	}
	
	public static void main(String [] args) {
		
		//The reference id of an anonymous object is not stored anywhere. Hence, it becomes unreachable.
		
		//anonymous object without reference id
        new GrabageCollector("t1"); 
   
        // calling garbage collector
        System.gc();
	}

	@Override
	/*
	 * Overriding finalize method to check which object is garbage collected
	 */
	protected void finalize() throws Throwable {
		// will print name of object
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}

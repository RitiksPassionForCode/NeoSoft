package com.test.neosoft.practice;

public class DepartmentCloneable implements Cloneable {
	
		int departmentId;
		String departmentName;
		
		public DepartmentCloneable(int departmentId, String departmentName) {
		    this.departmentId = departmentId;
		    this.departmentName = departmentName;
		  }
	
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		public static void test() throws CloneNotSupportedException {
			DepartmentCloneable d1 = new DepartmentCloneable(45, "mechanical");

		    // clone d1 and copy it into d2 DepartmentCloneable object
			// Shallow Copy
			DepartmentCloneable d2 = (DepartmentCloneable) d1.clone();
			System.out.println(d2.departmentId);
		    System.out.println(d2.departmentName);
		}
		

}

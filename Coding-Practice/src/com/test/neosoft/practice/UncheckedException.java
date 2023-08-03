package com.test.neosoft.practice;

import java.util.Arrays;
import java.util.List;

public class UncheckedException {
	
	int no = 25;
    public void uncheckedException(int no) {
        if (no < 0) {
            throw new IllegalArgumentException("No must be greater than zero");
        } else {
            this.no = no;
        }
    }

	public static void main(String[] args) {
		try {

			//Arithematic Exception
			int a = 0;
			int b = 1;
			int c = b / a;
			
			//StringIndexOutOfBounds Exception
			String s = "abcd";
			s.charAt(5);
			
			//ClassCast Exception
			Object obj = new String("Hello");
	        System.out.println((Integer) obj);
	        
			//IllegalArgument Exception
	        UncheckedException uncheckedException = new UncheckedException();
	        uncheckedException.uncheckedException(-1);
			
			//NullPointer Exception
			Address address = null;
			address.getCity();
			
			//UnsupportedOperation Exception
			String array[] = {"a", "b", "c"};
	        List<String> list = Arrays.asList(array);
	        list.add("d");

		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(ClassCastException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(UnsupportedOperationException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

package com.test.neosoft.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedException {
	
	private String name;

    public CheckedException(String name) {
        super();
        this.name = name;
    }

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost/STOREDB";
		String dbuser = "root";
		String dbpass = "root";
		try {
			//SQLException
			DriverManager.getConnection(dburl, dbuser, dbpass);
			
			// ClassNotFound Exception
			Class.forName("com.neosoft.MyInvisibleClass");

			// FileNotFound Exception
			new FileReader("somefile.txt");
			
			//NoSuchField Exception
			String obj = new String();
		    Class cls = obj.getClass();
		    cls.getField("name");
		    
		    //CloneNotSupported Exception
		    CheckedException checkedException = new CheckedException("John");
		    checkedException.clone();

		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

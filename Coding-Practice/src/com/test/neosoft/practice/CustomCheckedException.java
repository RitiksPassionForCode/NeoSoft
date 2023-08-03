package com.test.neosoft.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomCheckedException {

	public static void main(String[] main){
        FileInputStream myFile;
        //trying to open file
        try {
            myFile = new FileInputStream("E://myFolder//tempFile.txt");
        }catch (FileNotFoundException e) {
            //if not present, throw custom exception
            try{
                throw new FileException("PLease check File Name or path", e);
            }catch(Exception fileE){
                //getting message and stack Trace for exception
                fileE.getMessage();
                fileE.printStackTrace();
            }
       }
    }
}

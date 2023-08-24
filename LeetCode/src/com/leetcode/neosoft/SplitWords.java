package com.leetcode.neosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitWords {

	public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> arr = new ArrayList<>();
        String stringSep = String.valueOf(separator);
            for (String word : words) {
                String[] array = word.split("\\Q"+stringSep+"\\E");
                for (String splitWord : array) {
                    if(!splitWord.isEmpty()){
                    arr.add(splitWord);
                    }        
                }
            }
        return arr;
    }
	
	public static void main(String [] args) {
		List<String> words = new ArrayList<>();
		words.add("one.two.three");
		words.add("four.five");
		List<String> splitWordsBySeparator = splitWordsBySeparator(words, '.');
		System.out.println(splitWordsBySeparator);
	}
}

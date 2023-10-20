package com.test.neosoft.datastructure.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable {
	
	private Node[] dataMap;
	private int size = 5;	
	
	class Node{
		
		Node next;
		String key;
		int value;
		
		Node(String key, int value){
			this.key = key;
			this.value = value;
		}
		
	}
	
	public HashTable() {
		dataMap = new Node[size];
	}
	
	//Print HashTable
	public void printTable() {
		for(int i =0; i<dataMap.length; i++) {
			System.out.println(i + " : ");
			Node temp = dataMap[i];
			while(temp != null) {
				System.out.println("Key - " + temp.key + ", Value - " + temp.value);
				temp = temp.next;
			}
		}	
	}
	
	//Random hash index
	public int hash(String key) {
		int hash = 0;
		char[] chars = key.toCharArray();
		for(int i=0; i<chars.length; i++) {
			int ascii = chars[i];
			hash = (hash + ascii * 23) % dataMap.length;
		}
		return hash;
	}
	
	//Set value in hash table
	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if(dataMap[index] == null) {
			dataMap[index] = newNode;	
		} else {
			Node temp = dataMap[index];
			while(temp.next != null) {
				temp = temp.next; 
			}
			temp.next = newNode;
		}
	}
	
	//Get value in hash table
	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		while(temp != null) {
			if(Objects.equals(temp.key, key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return 0;
	}
	
	//Get all keys from hashTable
	public List<String> getAllKeys(){
		ArrayList<String> keys = new ArrayList<>();
		for(int i = 0; i<dataMap.length; i++) {
			Node temp = dataMap[i];
			while(temp != null) {
				keys.add(temp.key);
				temp = temp.next;
			}	
		}
		return keys;
	}
	
}

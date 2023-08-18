package com.test.neosoft.datastructure.practice;

public class LinkedList {
	
	public Node head;
	public Node tail;
	public int length;
	
	public class Node {

		int value;
		Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	//LinkedList print
	public void printList() {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.value);
			temp = temp.next;
			System.out.println(temp.value);
		}
	}
	
	//Print tail
	public void getTail() {
		System.out.println("Tail :" + tail.value);
	}
	
	//Print head
	public void getHead() {
		System.out.println("Head :" + head.value);
	}
	
	//Get length
	public void getLength() {
		System.out.println("Length :" + length);
	}
	
	//LinkedList append
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
}

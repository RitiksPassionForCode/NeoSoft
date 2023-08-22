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
		System.out.println(temp.value);
		while(temp.next != null) {
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
	
	//LinkedList remove last
	public Node removeLast() {
		if(length == 0) {
			return null;
		}
		
		Node temp = head;
		Node pre = head;
		while(temp.next!=null) {
			pre = temp;
			temp = temp.next;
		}
		
		tail = pre;
		tail.next = null;
		length --;
		if(length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
	
	//LinkedList Prepend
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
}
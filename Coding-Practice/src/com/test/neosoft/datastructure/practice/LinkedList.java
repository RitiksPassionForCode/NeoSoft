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
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}
	
	//LinkedList removeFirst
	public Node removeFirst() {
		if(length == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		
		if(length == 0) {
			tail = null;
		}
		return temp;
	}
	
	//LinkedList get item
	public Node get(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for(int i =0; i<index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	//LinkedList set method
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp != null) {
			temp.value = value;
			return true;
		} else {
			return false;
		}
	}
	
	//LinkedList insert
	public boolean insert(int index, int value) {
		if(index < 0 || index > length-1) {
			return false;
		}
		if(index == 0) {
			prepend(value);
		}
		if(index == length) {
			append(value);
		}
		Node newNode = new Node(value);
		Node temp = get(index-1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}
	
	//LinkedList remove
	public Node remove(int index) {
		if(index < 0 && index >= length) {
			return null;
		}
		if(index == 0) {
			removeFirst();
		}
		if(index == length-1) {
			removeLast();
		}
		
		Node prev = get(index-1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	//LinkedList reverse
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for(int i=0; i<length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
}

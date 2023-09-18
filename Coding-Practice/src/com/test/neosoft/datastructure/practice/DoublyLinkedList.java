package com.test.neosoft.datastructure.practice;

public class DoublyLinkedList {

	public Node head;
	public Node tail;
	int length;

	public class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	// DoublyLinkedList print
	public void PrintList() {
		Node temp = head;
		System.out.println(temp.value);
		while (temp.next != null) {
			temp = temp.next;
			System.out.println(temp.value);
		}
	}

	// Print tail
	public void getTail() {
		System.out.println("Tail :" + tail.value);
	}

	// Print head
	public void getHead() {
		System.out.println("Head :" + head.value);
	}

	// Get length
	public void getLength() {
		System.out.println("Length :" + length);
	}

	// DoublyLinkedList prepend
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}

	// DoublyLinkedList append
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	// DoublyLinkedList removeLast
	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = temp.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

	// DoublyLinkedList removeFirst
	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = temp.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

	// DoublyLinkedList get By index
	public Node get(int index) {
		if (index <= 0 || index >= length)
			return null;
		Node temp = head;
		if (index < length / 2) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}

	// DoublyLinkedList set By index
	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}
	
	//DoublyLinkedList insert
	public boolean insert(int index, int value) {
		if(index < 0 || index > length) return false;
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node before = get(index-1);
		Node after = before.next;
		newNode.next = after;
		newNode.prev = before;
		before.next = newNode;
		after.prev = newNode;
		length++;
		return true;
	}
	
	//DoublyLinkedList remove
	public Node remove(int index) {
		if(index < 0 || index >= length) return null;
		if(index == 0) {
			return removeFirst();
		}
		if(index == length-1) {
			return removeLast();
		}
		Node temp = get(index);
//		General way
//		Node after = temp.next;
//		Node before = temp.prev;
//		Shortcut
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
		temp.next = null;
		temp.prev = null;
		length--;
		return temp;
	}

	
}

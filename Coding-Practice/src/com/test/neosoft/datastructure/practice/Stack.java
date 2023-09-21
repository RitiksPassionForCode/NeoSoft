package com.test.neosoft.datastructure.practice;

public class Stack {

	public class Node {

		Node next;
		int value;

		Node(int value) {
			this.value = value;
		}

	}

	private Node top;
	private int height;

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	//Print stack elements
	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	//Add element to the stack
	public void push(int value) {
		Node newNode = new Node(value);
		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}

	//Remove element from stack
	public Node pop() {
		if (height == 0) return null;
		
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}

}

package com.test.neosoft.datastructure.practice;

import com.test.neosoft.datastructure.practice.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		
//		//linkedList 
//		LinkedList list = new LinkedList(4);
//		list.append(2);
//		list.append(0);
//		list.append(3);
//		list.getTail();
//		list.getHead();
//		list.getLength();
//		
//		System.out.println("List : ");
//		list.printList();
//		
//		System.out.println("Removed element:");
//		System.out.println(list.removeLast().value);
//		System.out.println("After removed element list is:");
//		list.printList();
//		
//		list.prepend(8);
//		System.out.println("After prepending an element in list:");
//		list.printList();
//		
//		list.removeFirst();
//		System.out.println("After removing first element in list:");
//		list.printList();
//		
//		System.out.println("Found the searched index in list:");
//		Node node = list.get(0);
//		System.out.println(node.value);
//		
//		System.out.println("After setting the value as 6 at index 0 in list");
//		list.set(0, 6);
//		list.printList();
//		
//		System.out.println("Insering 10 on 2nd index in list:");
//		list.insert(2, 10);
//		list.printList();
//		
//		System.out.println("Removing 10 from 2nd index in list:");
//		list.remove(2);
//		list.printList();
//		
//		System.out.println("Reverse the list:");
//		list.reverse();
//		list.printList();
		
		
		
//		//DoublyLinkedList
//		DoublyLinkedList doublyL= new DoublyLinkedList(1);
//		System.out.println("The list: ");
//		doublyL.PrintList();
//		System.out.println("After appending elements at last in the list:");
//		doublyL.append(0);
//		doublyL.append(5);
//		doublyL.append(8);
//		doublyL.append(9);
//		doublyL.PrintList();
//		
//		System.out.println("After removing first element in the list:");
//		doublyL.removeFirst();
//		doublyL.PrintList();
//		System.out.println("After removing last element in the list:");
//		doublyL.removeLast();
//		doublyL.PrintList();
//		System.out.println("After prepending 1 in the list:");
//		doublyL.prepend(1);
//		doublyL.PrintList();
//		
//		System.out.println("Get value of index 1 in the list:");
//		int get = doublyL.get(1).value;
//		System.out.println(get);
//		
//		System.out.println("Set value as 1 on index 1 in the list:");
//		doublyL.set(1,1);
//		doublyL.PrintList();
//		
//		System.out.println("Insert value 2 on index 2 in the list:");
//		doublyL.insert(2,2);
//		doublyL.PrintList();
//		
//		System.out.println("Remove value from index 2 in the list:");
//		doublyL.remove(2);
//		doublyL.PrintList();
		
		
		
//		//Stack
//		Stack stack = new Stack(4);
//		stack.push(6);
//		stack.push(0);
//		stack.pop();
//		
//		stack.printStack();
		
		//Queue
//		Queue queue = new Queue(0);
//		queue.enqueue(4);
//		queue.enqueue(3);
//		queue.dequeue();
//		
//		queue.printQueue();
		
		
		//BinarySearchTree
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("My first BST Node = " + bst.root);
		bst.insert(47);
		bst.insert(10);
		bst.insert(5);
		bst.insert(8);
		bst.insert(55);
		System.out.println("Position of root-left-left in bst = " + bst.root.left.left.value);
		
		boolean contains5 = bst.contains(5);
		boolean contains11 = bst.contains(11);
		System.out.println("Contains5- " + contains5 + " Contains11- " + contains11);
	}
}

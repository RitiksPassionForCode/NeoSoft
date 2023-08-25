package com.test.neosoft.datastructure.practice;

import com.test.neosoft.datastructure.practice.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		
		//linkedList 
		LinkedList list = new LinkedList(4);
		list.append(2);
		list.append(0);
		list.append(3);
		list.getTail();
		list.getHead();
		list.getLength();
		
		System.out.println("List : ");
		list.printList();
		
		System.out.println("Removed element:");
		System.out.println(list.removeLast().value);
		System.out.println("After removed element list is:");
		list.printList();
		
		list.prepend(8);
		System.out.println("After prepending an element in list:");
		list.printList();
		
		list.removeFirst();
		System.out.println("After removing first element in list:");
		list.printList();
		
		System.out.println("Found the searched index in list:");
		Node node = list.get(0);
		System.out.println(node.value);
		
		System.out.println("After setting the value as 6 at index 0 in list");
		list.set(0, 6);
		list.printList();
		
		System.out.println("Insering 10 on 2nd index in list:");
		list.insert(2, 10);
		list.printList();
		
		System.out.println("Removing 10 from 2nd index in list:");
		list.remove(2);
		list.printList();
		
		System.out.println("Reverse the list:");
		list.reverse();
		list.printList();
	}

}

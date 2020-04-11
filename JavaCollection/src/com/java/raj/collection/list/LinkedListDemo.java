package com.java.raj.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(5));
		list.add(new Integer(10));
		System.out.println("Linked list elements : "+ list);
		list.addFirst(199);
		list.addLast(new Integer(400));
		System.out.println("Linked list elements after addition : "+ list);
	}

}

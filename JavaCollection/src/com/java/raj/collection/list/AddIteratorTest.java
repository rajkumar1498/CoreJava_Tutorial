package com.java.raj.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddIteratorTest {

	public static void main(String[] args) {
		//Declare list here
		List<String> names = new ArrayList<>();
		// add element here
		names.add("Raj");
		names.add("Rupa");
		names.add("shanvi");
		names.add("Raju");
		System.out.println("List : " + names);
		
		//fetch iterator from list
		Iterator<String> iterator = names.iterator();
		// suppose we need to add element during iteration
		int count =0;
		for(;iterator.hasNext();){
			iterator.next();
			if(count == 2){
				//names.add(2,"shyam");
				names.remove("Rupa");
			}
			count++;
		}
		System.out.println("List : " + names);
		
		//5
		ListIterator<String> listiterator = names.listIterator();
		int numbering =0;
		for(;listiterator.hasNext();){
			listiterator.next();
			if(numbering == 2){
				listiterator.add("shyam");
				//names.remove("Rupa");
			}
			count++;
		}
		System.out.println("List : " + names);
	}

}

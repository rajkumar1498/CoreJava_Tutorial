package com.java.raj.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIteratorDemo {

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
						names.remove(count);
					}
					count++;
				}
				System.out.println("List : " + names);

	}

}

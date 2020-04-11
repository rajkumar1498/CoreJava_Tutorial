package com.java.raj.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,2,4,8,6,10,5,7);
		//sorting list in java in assecending order
		System.out.println("Unsorted list in java "+ list);
		// sorting
		Collections.sort(list);
		System.out.println("Sorted list in java "+ list);
		//sorting list in descending order in java, collection.sort method can be used to sort all elements in 
		//descending order if we pass it comparator which can return elements in descending orders
		// collection class provided built-in comparator for that which can sort object in descending orders
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list in descending order java "+ list);
		
		ArrayList al =new ArrayList();
		al.add("b");
		al.add("d");
		al.add("a");
		al.add("c");
		System.out.println("Unsorted list in java "+ al);
		Collections.sort(al);
		System.out.println("Sorted list in java "+ al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted list in descending order java "+ al);
	}

}

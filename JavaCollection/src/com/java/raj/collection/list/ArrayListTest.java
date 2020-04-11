package com.java.raj.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//1. Declare list here
		List<String> names = new ArrayList<>();
		//2. add element here
		names.add("Raj");
		names.add("Rupa");
		names.add("shanvi");
		names.add("Raju");
		//3. try to add invalid type in object
		//names.add(new Integer(10));
		//4. print the size here
		System.out.println("Size is :" + names.size());
		//5. print the list here
		System.out.println("List is :" + names);
		//6. add element to specified index
		names.add(3, "Ruhi");
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);
		//7. add element to invalid index
		/*names.add(6, "Ruhi");
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);*/
		//8. set element to specified index
		names.set(2, "sanju");
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);
		//9. add element to invalid index
		/*names.set(6, "Ruhi");
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);*/
		//10. check element exists in the list
		System.out.println("list contains my name is "+ names.contains("Raj"));
		//10. remove element by index
		System.out.println("object removed by index "+ names.remove(2));
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);
		//10. remove element by directly
		System.out.println("object removed by index "+ names.remove("Raju"));
		System.out.println("Size is :" + names.size());
		System.out.println("List is :" + names);
		//11. find position of elements
		System.out.println("position of element shanvi "+ names.indexOf("shanvi"));
		
	}

}

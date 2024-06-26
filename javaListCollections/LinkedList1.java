package javaListCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(400);
		list.add(70);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(60);
		list.add(null); //null values are not allowed in the linkedlist
		
		Collections.sort(list);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}

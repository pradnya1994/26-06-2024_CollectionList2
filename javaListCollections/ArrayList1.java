package javaListCollections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		//List<Integer> list = new ArrayList<Integer>();//10
		ArrayList<Integer> list = new ArrayList<Integer>();//10

		list.add(50);
		list.add(null);
		list.add(20);
		list.add(60);
		list.add(400);
		list.add(70);
		list.add(null);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(60);

		Iterator<Integer> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("---------------------------------");

	}

}

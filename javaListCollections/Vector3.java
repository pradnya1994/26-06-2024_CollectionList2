package javaListCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {


		//List<Integer> list = new Vector<Integer>();

		Vector<Integer> list = new Vector<Integer>();

		list.add(50);
		list.add(20);
		list.add(60);
		list.add(400);
		list.add(70);
		list.add(30);
		list.add(40);
		list.add(70);
		list.add(60);
		list.add(null);
		list.addElement(20);  //This method is of Vector class ..So cannot use List interface instead of Vector

		Iterator<Integer> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		System.out.println("--------------------------------------");

		Enumeration<Integer> e = list.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}


	}

}

package javaListCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {


		//List<Integer> list = new Stack<Integer>();

		Stack<Integer> list = new Stack<Integer>();

		list.push(20);
		list.push(20);
		list.push(45);
		list.push(null);
		list.push(50);
		
		System.out.println("-----removing top most value from stack-------");

		System.out.println(list.peek());	

		System.out.println("---Printing all the values of stack------");

		Iterator<Integer> iterator = list.iterator();

		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

		System.out.println("--Deleting top most valueof the stack--");

		list.pop();	
		
		System.out.println("---Printing all the values of stack------");
		Enumeration<Integer> e = list.elements();

		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		System.out.println("-----Adding the value in the stack-----");

		list.push(40);	

		System.out.println(list);
		
		System.out.println("------Removing element at particular index--------");

		list.removeElementAt(1);

		System.out.println(list);

	}

}

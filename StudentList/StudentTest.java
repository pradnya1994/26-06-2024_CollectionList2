package StudentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();//10
		
		

		list.add(new Student(101, "Pradnya"));
		list.add(null);
		list.add(new Student(102, "Mukund"));
		
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		

	}

}

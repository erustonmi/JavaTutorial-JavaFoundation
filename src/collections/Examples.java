package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Examples {

	public static void main(String[] args) throws Throwable {
		List myList = new ArrayList();
		
		myList.add("Hello");
		myList.add(new StringBuilder("Goodbye"));
		myList.add(LocalDate.of(2016, 10, 10));
		
		System.out.println(myList);
		
		System.out.println("Item at index 2 is " + myList.get(2));
		String s = (String)(myList.get(0));

		String listType = "java.util.LinkedList";
		Class c = Class.forName(listType);
		Object o = c.newInstance();
		List<CharSequence> ls = (List<CharSequence>)o;
		
		System.out.println("list is of type: " + ls.getClass().getName());

		ls.add("Hello");
		ls.add(new StringBuilder("Goodbye"));
//		ls.add(LocalDate.of(2016, 9, 9));
		CharSequence itemOne = ls.get(0);
	}

}

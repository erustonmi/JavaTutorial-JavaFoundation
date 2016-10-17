package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Examples {

	public static void main(String[] args) {
		List myList = new ArrayList();
		
		myList.add("Hello");
		myList.add(new StringBuilder("Goodbye"));
		myList.add(LocalDate.of(2016, 10, 10));
		
		System.out.println(myList);
		
		System.out.println("Item at index 2 is " + myList.get(2));
		String s = (String)(myList.get(0));
		
		List<CharSequence> ls = new ArrayList<CharSequence>();
		ls.add("Hello");
		ls.add(new StringBuilder("Goodbye"));
//		ls.add(LocalDate.of(2016, 9, 9));
	}

}

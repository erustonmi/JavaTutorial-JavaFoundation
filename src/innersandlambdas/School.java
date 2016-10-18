package innersandlambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class School {

	public static void main(String[] args) {
		List<Student> roster = new ArrayList<>(Arrays.asList(
				new Student("Jim", 3.8F, "Math", "Physics", "Chemistry"),
				new Student("Fred", 2.8F, "Art", "History"),
				new Student("Sheila", 3.9F, "Math", "Physics", "Chemistry", "Organic Chemistry"),
				new Student("Alice", 3.2F, "Politics")				
				));
		
		System.out.println("Roster: " + roster);
		Collections.sort(roster, Student.getGpaComparator());
		System.out.println("Roster: " + roster);
	}

}

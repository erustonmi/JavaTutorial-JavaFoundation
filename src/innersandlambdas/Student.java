package innersandlambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {
	private String name;
	private float gpa;
	private List<String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public List<String> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", courses=" + courses + "]";
	}

	public Student(String name, float gpa, String ... courses) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.courses = Arrays.asList(courses);
	}
	
	public static Comparator<Student> getGpaComparator() {
		return (o1, o2) -> Float.compare(o1.getGpa(), o2.getGpa());
	}
	
//	public static Comparator<Student> getGpaComparator() {
//		return gpaComparator;
//	}
//
//	private static Comparator<Student> gpaComparator = 
//			(o1, o2) -> Float.compare(o1.getGpa(), o2.getGpa());
//
	
//	private static Comparator<Student> gpaComparator = (o1, o2) -> /*{*/
//				/*return*/ Float.compare(o1.getGpa(), o2.getGpa())/*;*/
//			/*}*/;

//	private static Comparator<Student> gpaComparator = /*new Comparator<Student>() {*/
//
//		/*@Override
//		public int compare*/(Student o1, Student o2) -> {
//			System.out.println("in nested class.");
//			return Float.compare(o1.getGpa(), o2.getGpa());
//		}
//	/*}*/;

//	private static Comparator<Student> gpaComparator = new /*GPACompartor();
//	private static class GPACompartor implements */Comparator<Student>() {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			System.out.println("in nested class.");
//			return Float.compare(o1.getGpa(), o2.getGpa());
//		}
//	};
	
//	private static Comparator<Student> gpaComparator = new GPACompartor();
//	
//	private static class GPACompartor implements Comparator<Student> {
//
//		@Override
//		public int compare(Student o1, Student o2) {
//			System.out.println("in nested class.");
//			return Float.compare(o1.getGpa(), o2.getGpa());
//		}
//	}
}

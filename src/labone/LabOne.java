package labone;

public class LabOne {

	public static void main(String[] args) {
		int v = 0;
		v++;
		
		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println("The string is" + s);
		System.out.println("The StringBuilder is " + sb);
		
		Object o1 = s;
		Object o2 = sb;
		
		System.out.println(o1 == sb);
		System.out.println(o1 == s);
		
		System.out.println("s.equals(sb) " + s.equals(sb));
		System.out.println("s.equals(sb) " + s.equals(sb.toString()));
		System.out.println("s.equals(sb) " + s.equals("" + sb));
		
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println("s == s2 " + (s == s2));
		System.out.println("s == s3 " + (s == s3));
		
		s3 = s3.intern();
		System.out.println("s == s3 " + (s == s3));
		
		StringBuilder sb2 = new StringBuilder(sb);
		System.out.println("sb2.equals(sb)" + sb2.equals(sb));
		
		s = s.concat(", World!");
		System.out.println("Modified s is " + s);
		
		sb.append(", modified the original");
		System.out.println("sb is now: " + sb);
		
		long bigNum = 1_000_000_000_000L;
		float fareheit = 200.0F;
		float celcius = 5.0F/9 * (fareheit - 32);
		
	}

}

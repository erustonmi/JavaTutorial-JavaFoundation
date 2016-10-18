package methods;

public class Modifiers {

	public static void modify(int x) {
		x *= 2;
	}

	public static void modify(StringBuilder sb) {
		sb.append(" changed");
	}

	public static void modify(String s) {
		s = s.concat(" changed");
	}

	public static String modify(String a, String b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int x = 2; modify(x);
		System.out.println("x is " + x);

		StringBuilder sb = new StringBuilder("This has");
		modify(sb);
		System.out.println("sb is " + sb);
		
		String s = "Original";
		modify(s);
		System.out.println("s is " + s);

		System.out.println("joined is " + modify("Hello", " World!"));
	}

}

package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlStructures {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Fred", "Jim", "Sheila"));
		int length = list.size();
		
		String longest = null;
		int longestLength = 0;
		int id = 0;
		while (id < length) {
			System.out.println("item: " + id + " is " + list.get(id));
			if (list.get(id).length() > longestLength) {
				longest = list.get(id);
			}
			id++;
		}
		System.out.println("------");
		
		for (int i = 0; i < length; i++) {
			System.out.println("item: " + i + " is " + list.get(i));
		}
		
		System.out.println("------");
		
		for (String s : list) {
			System.out.println(s);
		}
	}

}

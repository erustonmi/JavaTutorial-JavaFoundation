package generics;

import java.awt.Color;
import java.time.LocalDate;

public class Store {
	public static void main(String[] args) {
//		Pair<String> pstr = new Pair<>("Fred", "Jones");
//
//		String s = pstr.getLeft();
//
//		Pair<LocalDate> pd = new Pair<>(LocalDate.of(2016, 11, 11),
//				LocalDate.of(2016, 11, 12));
//		LocalDate d = pd.getRight();
//		
		Pair<Shoe> pshoe = new Pair<>(new Shoe(9, Color.BLACK), new Shoe(9, Color.BLACK));
		System.out.println("Pair is matched? " + pshoe.matching());

		// NOT PERMITTED
//		Pair<Umbrella> pu;
	}
}

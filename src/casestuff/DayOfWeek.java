package casestuff;

import java.util.concurrent.ThreadLocalRandom;

public class DayOfWeek {

	public static void main(String[] args) {
//		int day = (int)(Math.random() * 7) + 1;
		int day = ThreadLocalRandom.current().nextInt(1, 8);
		String dayName = "ERROR";
		switch(day) {
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wedday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default: assert false : "this should never happen";
		}
		System.out.println("Day name is " + dayName);
		
		String [] dayNames = {
				"Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday",
		};
		
		System.out.println("From array, get " + dayNames[day -1]);

		for (int i = 0; i < dayNames.length; i++) {
			System.out.println("> " + dayNames[i]);
		}
	}

}

package methods;

import java.util.concurrent.ThreadLocalRandom;

public class TempConvMethod {

	public static double fToC(double farenheit) {
		return 5.0 * (farenheit - 32) / 9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			float temp = (float)ThreadLocalRandom.current().nextDouble(32, 212);
			System.out.printf("%7.5f farenheit is %7.5f celcius\n",
					temp, fToC(temp));
		}
	}
}

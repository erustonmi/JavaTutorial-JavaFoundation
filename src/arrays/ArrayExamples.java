package arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		int [] ia = { 1,
				9,
				3,
				5,
				7,
				};
		
		System.out.println("array contains "+ ia.length);
		
		int [] newIa = new int[50];
		
		for (int i : ia) {
			System.out.println("> " + i);
		}
		System.arraycopy(ia, 0, newIa, 0, ia.length);
		ia = newIa;
		System.out.println("array contains "+ ia.length);
		
		int [][] twoD = {
				{ 1, 2, 3 },
				{ 4, 5 },
				{ 6 }
		};
		
		for (int x = 0; x < twoD.length; x++) {
			for (int y = 0; y < twoD[x].length; y++) {
				System.out.print(" " + twoD[x][y]);
			}
			System.out.println();
				
		}
		
	}

}

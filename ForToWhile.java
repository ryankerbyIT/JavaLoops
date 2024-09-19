/**
 * Convert the for loop to a while loop:
 */

public class ForToWhile {

	public static void main(String[] args) {
		
		// Original for loop:
//		for (int x = 50; x > 0; x--) {
//		    System.out.println(x + " seconds to go.");
//		}

		// Converted while loop:
		int x = 50;
		while (x > 0) {
		    System.out.println(x + " seconds to go.");
		    x--;
		}



	}

}

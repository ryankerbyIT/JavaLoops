/**
 * Convert the following while loop to a for loop:
 */
public class WhilteToFor {

	public static void main(String[] args) {
		
		// Original while loop:
//		int count = 0;
//		while (count < 50) {
//		    System.out.println("count is " + count);
//		    count++;
//		}

		
		// Converted for loop:
		for (int count = 0; count < 50; count++) {
		    System.out.println("count is " + count);
		}

	}

}
/**
 * Explanation:
The initialization (int count = 0), condition (count < 50), 
and increment (count++) are all placed inside the for loop 
structure. This conversion simplifies the code, combining 
the initialization, condition, and update in one line.
 */


/**
 * Convert the do-while loop to a while loop:
 */
import java.util.Scanner;
public class DoWhileToWhile {
	public static void main(String[] args) {
		
		// Original do-while loop:
//		Scanner keyboard = new Scanner(System.in);
//		String input;
//		char sure;
//		do {
//		    System.out.print("Are you sure you want to quit? ");
//		    input = keyboard.next();
//		    sure = input.charAt(0);
//		} while (sure != 'Y' && sure != 'N');
//	}
		
		// Converted while loop:
	Scanner keyboard = new Scanner(System.in);
	String input;
	char sure;
	do {
	    System.out.print("Are you sure you want to quit? ");
	    input = keyboard.next();
	    sure = input.charAt(0);
	} while (sure != 'Y' && sure != 'N');

	}
}

/**
 * Explanation:
In a while loop, the condition is checked before 
the loop starts. Therefore, we move the first prompt 
and input outside the loop to ensure it runs at least once.
After that, the loop will continue to ask for input u
ntil the user enters 'Y' or 'N'.
 */


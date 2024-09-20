/**
 * Convert a while loop to a do-while loop
 */
	
/**
 * In a do-while loop, the code block is executed 
 * first, and the condition is checked afterward. 
 * The loop will always run at least once.
 */

public class WhileToDoWhileConvert {
	public static void main(String[] args) {
	// Example conversion

	int counter = 0;

	// Original while loop
	/*
	while (counter < 10) {
	    System.out.println("Counter is: " + counter);
	    counter++;
	}
	*/

	// Converted do-while loop
	do {
	    System.out.println("Counter is: " + counter);
	    counter++;
	} while (counter < 10);

	
		
	}

}

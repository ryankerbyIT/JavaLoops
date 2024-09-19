// A program to display a random integer 
// in the range of 1 through 10.

import java.util.Random;
public class DisplayRandomInt {
	public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        
        // Generate a random number between 1 and 10 (inclusive)
        int randomNumber = random.nextInt(10) + 1; 
        
        // Display the random number
        System.out.println("Random number: " + randomNumber);
    }

}
/* 
 * Explanation:
 * We use Random's nextInt(10) to generate a 
 * random number between 0 and 9, and then add 
 * 1 to shift the range to 1 through 10. 
 * */
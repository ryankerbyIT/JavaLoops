/* Complete the program to perform the following 
 * actions 10 times: Generate a random number that 
 * is either 0 or 1. Display either the word 
 * “Yes” or “No” depending on the random number.
 * */
import java.util.Random;
public class RandomNextInt2 {
	public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        
        // Loop 10 times
        for (int i = 0; i < 10; i++) {
            // Generate a random number (0 or 1)
            int randomNumber = random.nextInt(2);
            
            // Display "Yes" if 1, "No" if 0
            if (randomNumber == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
/*
Explanation:
nextInt(2) generates a number between 0 and 1.
Depending on the result, we print either "Yes" (for 1) or "No" (for 0).
The loop runs 10 times to achieve the repeated output.
*/
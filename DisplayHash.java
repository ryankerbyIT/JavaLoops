/**
 * Nested loop to display 10 rows of 15 # characters
 */
public class DisplayHash {
    public static void main(String[] args) {
        // Outer loop for the 10 rows
        for (int i = 0; i < 10; i++) {
            // Inner loop for the 15 characters in each row
            for (int j = 0; j < 15; j++) {
                System.out.print("#");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

/**
 * Explanation:
The outer loop runs 10 times, once for each row.
The inner loop runs 15 times, printing # each time.
After printing 15 # characters, System.out.println() 
moves to the next line.
 */


/**
 * Write a program that asks the user for a positive 
 * integer no greater than 15. The program should then 
 * display a square on the screen using the character 'X'. 
 * The number entered by the user will be the length of 
 * each side of the square.
 */
import java.util.Scanner;

public class SquareDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a positive integer no greater than 15
        int size;
        do {
            System.out.print("Enter a positive integer no greater than 15: ");
            size = scanner.nextInt();
            if (size < 1 || size > 15) {
                System.out.println("Invalid input. Please enter a number between 1 and 15.");
            }
        } while (size < 1 || size > 15);

        // Display the square using 'X' characters
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("X");
            }
            System.out.println();  // Move to the next line
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The program prompts the user for an integer between 1 and 15.
	Input validation ensures the user provides a valid input within 
	this range. It then uses two nested loops to print a square of 'X' 
	characters, where the size of each side is equal to the
	user-entered number.
	
	Enter a positive integer no greater than 15: 5
XXXXX
XXXXX
XXXXX
XXXXX
XXXXX

 */


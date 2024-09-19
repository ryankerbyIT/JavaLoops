/**
 * Write a program that asks the user to enter a 
 * series of integers, ending the series with -99. 
 * Afterward, the program should display the largest 
 * and smallest numbers entered.
 */
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Prompt user to enter numbers, ending with -99
        System.out.println("Enter numbers (-99 to stop):");

        // Loop until the user enters -99
        while (true) {
            number = scanner.nextInt();

            if (number == -99) {
                break;  // End the loop if -99 is entered
            }

            // Update largest and smallest values
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        // Display the largest and smallest numbers entered
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);

        scanner.close();
    }
}

/**
 * Explanation:
	The program continually asks the user to enter integers, 
	stopping when the user enters -99. It keeps track of the 
	largest and smallest numbers entered using variables largest 
	and smallest. Once -99 is entered, the program outputs the
	largest and smallest values from the series.
 */


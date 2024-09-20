/**
 * Write a program that asks the user for a positive 
 * nonzero integer value and uses a loop to sum all 
 * the integers from 1 up to the number entered.
 */
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        // Ask the user for a positive nonzero integer
        System.out.print("Enter a positive nonzero integer: ");
        number = scanner.nextInt();

        // Ensure the number is positive
        if (number > 0) {
            // Loop to calculate the sum of all integers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            // Display the result
            System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);
        } else {
            System.out.println("Please enter a positive nonzero integer.");
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The program prompts the user to input a positive integer.
	It then uses a for loop to calculate the sum of all integers 
	from 1 to the entered number. The sum is displayed at the end.
	If the user enters a non-positive integer, the program 
	reminds the user to input a positive value.
 */


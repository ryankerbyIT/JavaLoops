/**
 * Here's a Java program that asks the user to enter 
 * a number 10 times and keeps a running total of 
 * the numbers entered:
 */
import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0; // Variable to store the running total

        // Loop to ask the user for a number 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt(); // Get user input
            total += number; // Add the number to the total
        }

        // Display the running total
        System.out.println("The running total of the numbers "
        		+ "entered is: " + total);
        scanner.close();
    }
}

/**
 * Explanation:
A for loop runs 10 times, asking the user to input a 
number during each iteration. The user's input is 
added to the total, which keeps a running sum.
Once the loop finishes, the total sum of the 
numbers is displayed.
 */

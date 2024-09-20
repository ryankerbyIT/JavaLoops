/**
 * Write a program that calculates how much a 
 * person would earn over a period of time if 
 * the salary starts at 1 penny the first day 
 * and doubles each day. The program should display 
 * the daily salary and the total pay in dollars.
 */
import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        double totalPay = 0.0;  // To store total earnings in dollars
        double dailyPay = 0.01; // Start with 1 penny (0.01 dollars)

        // Input validation: Get the number of days worked
        do {
            System.out.print("Enter the number of days worked (must be at least 1): ");
            days = scanner.nextInt();
            if (days < 1) {
                System.out.println("You must work at least 1 day.");
            }
        } while (days < 1);

        // Display header
        System.out.println("Day\tSalary");
        System.out.println("-----------------");

        // Loop to calculate and display daily salary and total pay
        for (int i = 1; i <= days; i++) {
            System.out.printf("%d\t$%.2f\n", i, dailyPay);
            totalPay += dailyPay;  // Accumulate total earnings
            dailyPay *= 2;         // Double the daily pay for the next day
        }

        // Display the total pay in dollars
        System.out.printf("\nTotal pay: $%.2f\n", totalPay);

        scanner.close();
    }
}

/**
 * Explanation:
	The program starts with a daily pay of 1 penny (0.01 dollars) 
	and doubles it each day.
	The total pay is accumulated, and both the daily and total 
	earnings are displayed in dollars.
	Input validation ensures that the user enters at least 1 day.
	
	Enter the number of days worked (must be at least 1): 5
Day     Salary
-----------------
1       $0.01
2       $0.02
3       $0.04
4       $0.08
5       $0.16

Total pay: $0.31

 */


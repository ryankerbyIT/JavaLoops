/**
 * Write a program that calculates the average monthly 
 * rainfall over a period of years. The program should 
 * ask for the number of years and use nested loops to 
 * collect data. The outer loop runs for each year, and 
 * the inner loop runs for each month (12 iterations). 
 * After gathering the data, display the total months, 
 * total rainfall, and average monthly rainfall.
 */
import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMonths = 0;
        double totalRainfall = 0.0;

        // Ask for the number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Input validation for years
        while (years < 1) {
            System.out.println("The number of years must be at least 1.");
            System.out.print("Enter the number of years: ");
            years = scanner.nextInt();
        }

        // Outer loop for each year
        for (int i = 1; i <= years; i++) {
            System.out.println("\nYear " + i);

            // Inner loop for each month
            for (int j = 1; j <= 12; j++) {
                System.out.print("Enter the rainfall (in inches) for month " + j + ": ");
                double monthlyRainfall = scanner.nextDouble();

                // Input validation for rainfall (no negative numbers)
                while (monthlyRainfall < 0) {
                    System.out.println("Rainfall cannot be negative.");
                    System.out.print("Enter the rainfall (in inches) for month " + j + ": ");
                    monthlyRainfall = scanner.nextDouble();
                }

                // Accumulate total rainfall and total months
                totalRainfall += monthlyRainfall;
                totalMonths++;
            }
        }

        // Calculate average rainfall
        double averageRainfall = totalRainfall / totalMonths;

        // Display the results
        System.out.println("\nTotal number of months: " + totalMonths);
        System.out.printf("Total rainfall: %.2f inches\n", totalRainfall);
        System.out.printf("Average monthly rainfall: %.2f inches\n", averageRainfall);

        scanner.close();
    }
}

/**
 * Explanation:
	The program asks the user for the number of years, and then 
	for each month’s rainfall. Input validation ensures that the 
	number of years is at least 1 and that rainfall values are 
	non-negative. After gathering all the rainfall data, the 
	program calculates and displays the total months, total 
	rainfall, and average monthly rainfall.
 */


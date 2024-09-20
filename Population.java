/**
 * Write a program that predicts the size of a population 
 * of organisms based on the starting number of organisms, 
 * the daily population increase percentage, and the number 
 * of days. Use a loop to display the size of the population 
 * for each day.
 */
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int population;
        double dailyIncrease;
        int days;

        // Input validation for population size (minimum 2)
        do {
            System.out.print("Enter the starting number of organisms (minimum 2): ");
            population = scanner.nextInt();
            if (population < 2) {
                System.out.println("The starting population must be at least 2.");
            }
        } while (population < 2);

        // Input validation for daily population increase (non-negative)
        do {
            System.out.print("Enter the average daily population increase (as a percentage): ");
            dailyIncrease = scanner.nextDouble();
            if (dailyIncrease < 0) {
                System.out.println("The daily population increase cannot be negative.");
            }
        } while (dailyIncrease < 0);

        // Input validation for number of days (minimum 1)
        do {
            System.out.print("Enter the number of days they will multiply (minimum 1): ");
            days = scanner.nextInt();
            if (days < 1) {
                System.out.println("The number of days must be at least 1.");
            }
        } while (days < 1);

        // Display population for each day
        System.out.println("\nDay\tPopulation");
        System.out.println("-------------------");
        for (int i = 1; i <= days; i++) {
            System.out.println(i + "\t" + population);
            // Increase the population by the daily percentage
            population += population * (dailyIncrease / 100);
        }

        scanner.close();
    }
}

/**
 * Explanation:
	 The program prompts the user for the initial population, 
	 daily population increase as a percentage, and the number
	 of days. Input validation ensures the population is at 
	 least 2, the daily increase is non-negative, and the 
	 number of days is at least 1. A loop displays the 
	 population for each day, with the population increasing 
	 based on the percentage input.
 */


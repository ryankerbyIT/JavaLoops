/**
 * Write a program that asks the user to enter the 
 * amount they have budgeted for a month. Then, use 
 * a loop to prompt the user to enter their expenses 
 * for the month. Afterward, the program should display 
 * the amount that the user is over or under budget.
 */
import java.util.Scanner;

public class BudgetAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their budget
        System.out.print("Enter your budget for the month: $");
        double budget = scanner.nextDouble();

        double totalExpenses = 0;
        double expense;

        // Loop to get expenses from the user
        while (true) {
            System.out.print("Enter an expense (or -1 to stop): $");
            expense = scanner.nextDouble();

            if (expense == -1) {
                break;  // End the loop if user enters -1
            }

            totalExpenses += expense;  // Accumulate expenses
        }

        // Calculate if the user is over or under budget
        double difference = budget - totalExpenses;

        if (difference > 0) {
            System.out.printf("You are under budget by $%.2f\n", difference);
        } else if (difference < 0) {
            System.out.printf("You are over budget by $%.2f\n", -difference);
        } else {
            System.out.println("You are exactly on budget.");
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The program asks for the user's budget and then takes 
	multiple expenses as input. It continues to accumulate 
	expenses until the user enters -1 to stop. It calculates 
	the difference between the budget and total expenses, and 
	then displays whether the user is over or under budget.
 */

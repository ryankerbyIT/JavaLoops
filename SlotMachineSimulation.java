/**
 * The program simulates a slot machine that displays 
 * random words instead of images. If two or more of 
 * the words match, the user wins money. The program 
 * asks the user if they want to play again and displays 
 * the total money entered and the total money won at 
 * the end.
 */
import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] slotSymbols = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        double totalMoneyEntered = 0;
        double totalMoneyWon = 0;
        String playAgain;

        do {
            // Ask the user to enter the amount of money to insert
            System.out.print("Enter the amount of money to insert into the slot machine: $");
            double moneyEntered = scanner.nextDouble();
            totalMoneyEntered += moneyEntered;

            // Generate three random words (simulated slot machine images)
            String word1 = slotSymbols[random.nextInt(slotSymbols.length)];
            String word2 = slotSymbols[random.nextInt(slotSymbols.length)];
            String word3 = slotSymbols[random.nextInt(slotSymbols.length)];

            // Display the randomly selected words
            System.out.println("Slot machine result: " + word1 + " | " + word2 + " | " + word3);

            // Determine if the user won and calculate the winnings
            if (word1.equals(word2) && word2.equals(word3)) {
                // Three matching words, win 3 times the money entered
                double winnings = moneyEntered * 3;
                System.out.println("Congratulations! You won $" + winnings);
                totalMoneyWon += winnings;
            } else if (word1.equals(word2) || word1.equals(word3) || word2.equals(word3)) {
                // Two matching words, win 2 times the money entered
                double winnings = moneyEntered * 2;
                System.out.println("Congratulations! You won $" + winnings);
                totalMoneyWon += winnings;
            } else {
                // No matching words, no winnings
                System.out.println("Sorry, you didn't win anything.");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        // Display the total amount entered and won
        System.out.println("Total money entered: $" + totalMoneyEntered);
        System.out.println("Total money won: $" + totalMoneyWon);

        scanner.close();
    }
}

/**
 * Explanation:
	The program asks the user to input an amount of money to 
	"insert" into the slot machine. It then randomly selects 
	three words from the list {"Cherries", "Oranges", "Plums", 
	"Bells", "Melons", "Bars"} to simulate the slot machine 
	results. If all three words match, the user wins three 
	times the money they entered. If two words match, they 
	win two times the money they entered. The user is asked if
	they want to play again, and the process repeats until they 
	choose to stop. At the end of the game, the total amount of 
	money entered and the total amount of money won are displayed.
	
			Example Output:
			
Enter the amount of money to insert into the slot machine: $5
Slot machine result: Cherries | Oranges | Cherries
Congratulations! You won $10.0
Do you want to play again? (yes/no): yes

Enter the amount of money to insert into the slot machine: $3
Slot machine result: Bars | Bars | Bars
Congratulations! You won $9.0
Do you want to play again? (yes/no): no

Total money entered: $8.0
Total money won: $19.0

 */


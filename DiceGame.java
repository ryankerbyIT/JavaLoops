/**
 * Write a program that plays a simple dice game between 
 * the computer and the user. The program should repeat 
 * 10 times. Each iteration should: Generate a random 
 * integer between 1 and 6 for both the computer and the 
 * user. Compare the two dice values and determine the 
 * winner. Keep track of how many times the user and the 
 * computer win. At the end of 10 rounds, declare the grand 
 * winner (the one with the most wins).
 */
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int computerWins = 0;
        int userWins = 0;

        // Loop for 10 rounds
        for (int i = 0; i < 10; i++) {
            // Generate random dice roll for computer and user (1 to 6)
            int computerDie = random.nextInt(6) + 1;
            int userDie = random.nextInt(6) + 1;

            System.out.println("Round " + (i + 1));
            System.out.println("Computer rolled: " + computerDie);
            System.out.println("User rolled: " + userDie);

            // Determine the winner for this round
            if (computerDie > userDie) {
                System.out.println("Computer wins this round.");
                computerWins++;
            } else if (userDie > computerDie) {
                System.out.println("User wins this round.");
                userWins++;
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();  // New line for readability
        }

        // Display the final result
        System.out.println("Final Results:");
        System.out.println("Computer wins: " + computerWins);
        System.out.println("User wins: " + userWins);

        if (computerWins > userWins) {
            System.out.println("The grand winner is the computer.");
        } else if (userWins > computerWins) {
            System.out.println("The grand winner is the user.");
        } else {
            System.out.println("It's a tie overall!");
        }
    }
}

/**
 * Explanation:
	The program generates random numbers between 1 and 6 for 
	both the user and the computer using Random.nextInt().
	It compares the dice rolls in each round to determine 
	the winner, and keeps count of how many rounds each 
	player wins. After 10 rounds, the program displays the 
	total number of wins for both the computer and the user 
	and declares the grand winner.
	
				Round 1
Computer rolled: 4
User rolled: 6
User wins this round.

Round 2
Computer rolled: 2
User rolled: 2
It's a tie!

...

Final Results:
Computer wins: 3
User wins: 6
The grand winner is the user.
 */


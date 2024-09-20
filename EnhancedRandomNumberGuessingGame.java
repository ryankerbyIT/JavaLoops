/**
 * Enhance the previous program so it keeps a count 
 * of how many guesses the user has made. When the 
 * user guesses correctly, display the total number 
 * of guesses.
 */
import java.util.Random;
import java.util.Scanner;

public class EnhancedRandomNumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int guessCount = 0;  // To keep track of the number of guesses

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        // Loop until the user guesses correctly
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("It took you " + guessCount + " guesses.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}

/**
 * Explanation:
	This program builds on the previous one, adding a 
	counter (guessCount) to keep track of the number 
	of guesses. When the user guesses correctly, it 
	displays the number of attempts it took.
 */


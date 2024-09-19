/**
 * Write a program that generates a random number
 *  and asks the user to guess what the number is.
 *   The program should indicate whether the user's 
 *   guess is too high, too low, or correct, and 
 *   should repeat until the user guesses correctly.
 */
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        // Loop until the user guesses correctly
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}

/**
 * Explanation:
	The program generates a random number between 1 and 100.
	It asks the user to guess the number, giving feedback if 
	the guess is too high or too low.
	The loop continues until the user guesses the correct number.
 */


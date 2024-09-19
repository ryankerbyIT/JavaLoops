/**
 * Write a program that tests your ESP 
 * (extrasensory perception). The program should 
 * randomly select a color from the following list: 
 * Red, Green, Blue, Orange, Yellow. The user should 
 * then try to guess the randomly selected color. 
 * The program repeats 10 times and displays how many 
 * times the user guessed the correct color.
 */
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // List of colors
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int correctGuesses = 0;

        // Loop to repeat the game 10 times
        for (int i = 0; i < 10; i++) {
            // Randomly select a color
            int randomIndex = random.nextInt(colors.length);
            String selectedColor = colors[randomIndex];

            // Ask the user to guess the color
            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow): ");
            String userGuess = scanner.nextLine();

            // Display the selected color
            System.out.println("The selected color was: " + selectedColor);

            // Check if the user guessed correctly
            if (userGuess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }

            System.out.println();  // New line for better readability
        }

        // Display the number of correct guesses
        System.out.println("You guessed the correct color " + correctGuesses + " times out of 10.");

        scanner.close();
    }
}

/**
 * Explanation:
	The program uses an array of strings to store the list 
	of colors: Red, Green, Blue, Orange, and Yellow.
	It generates a random index to select a color from the 
	list and prompts the user to guess the color.
	The program repeats this process 10 times and counts how 
	many times the user guessed the correct color.
	Finally, it displays the number of correct guesses out of 10.
 */


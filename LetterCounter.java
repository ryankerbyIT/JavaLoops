/**
 * Write a program that asks the user to enter 
 * a string and a character. The program should
 * count and display the number of times that 
 * the specified character appears in the string.
 */
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Ask the user to enter a character
        System.out.print("Enter a character to count: ");
        char character = scanner.next().charAt(0);

        int count = 0;

        // Loop through the string to count occurrences of the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == character) {
                count++;
            }
        }

        // Display the result
        System.out.println("The character '" + character + "' appears " + count + " times in the string.");

        scanner.close();
    }
}

/**
 * Explanation:
The program asks the user to input a string and a character.
It loops through the string and counts how many times the 
specified character appears. The result is displayed to the user.
 */

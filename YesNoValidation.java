/**
 * Input validation loop to ask for the word "yes" or "no":
 */
import java.util.Scanner;

public class YesNoValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Keep asking until a valid word is entered
        do {
            System.out.print("Enter 'yes' or 'no': ");
            input = scanner.next().toLowerCase();
        } while (!input.equals("yes") && !input.equals("no"));

        System.out.println("You entered: " + input);
        scanner.close();
    }
}



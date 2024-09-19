/**
 *  Input validation loop to ask for a number between 1 and 4:
 */
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Keep asking until a valid number is entered
        do {
            System.out.print("Enter a number between 1 and 4: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 4);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}



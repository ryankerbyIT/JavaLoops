/**
 * Write a program that asks the user to enter today’s 
 * sales for five stores. The program should display a 
 * bar chart comparing each store’s sales, where each 
 * asterisk (*) represents $100 in sales.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int lineNumber = 1;

            // Read and display each line with a line number
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        scanner.close();
    }
}

/**
 * Explanation:
	The program reads each line of the file and prints it with 
	a line number. The line numbers start at 1 and increase with 
	each line.
 */


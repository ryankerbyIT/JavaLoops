/**
 * Here’s a Java program using a while loop that lets the user enter 
 * a number, multiplies it by 10, and stores the result in the 
 * variable product. The loop will continue as long as product 
 * is less than 100:
 */
import java.util.Scanner;

public class MultiplyByTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 0;

        // Keep iterating while the product is less than 100
        while (product < 100) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            product = number * 10;
            System.out.println("Product is: " + product);
        }

        System.out.println("The loop has ended because product is 100 or more.");
        scanner.close();
    }
}

/**
Explanation:
The loop continues until the product is 100 or greater.
The user is prompted to input a number, and that number 
is multiplied by 10. The result is stored in product, and 
the loop continues as long as product is less than 100.
**/
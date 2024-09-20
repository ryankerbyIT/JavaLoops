/**
 * Write a program that displays a table of Celsius 
 * temperatures from 0 through 20 and their Fahrenheit 
 * equivalents. The formula for converting a temperature 
 * from Celsius to Fahrenheit is: 
 * 
 * 				F = ((9/5)*C) + 32
 * 
 * Where: F is the Fahrenheit temperature.
 * Where: C is the Celsius temperature.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        System.out.println("---------------------");

        // Loop to display the table for Celsius temperatures from 0 to 20
        for (int celsius = 0; celsius <= 20; celsius++) {
            // Calculate the Fahrenheit equivalent
            double fahrenheit = (9.0 / 5.0) * celsius + 32;

            // Display the Celsius and Fahrenheit temperatures
            System.out.printf("%d\t\t%.2f\n", celsius, fahrenheit);
        }
    }
}

/**
 * Explanation:
	The program calculates the Fahrenheit equivalent of Celsius
	temperatures from 0 to 20 using the given formula.
	It displays the results in a formatted table, using 
	a loop to iterate through the Celsius values.
 */


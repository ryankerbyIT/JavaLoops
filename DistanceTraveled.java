/**
 * Write a program that asks for the speed of 
 * a vehicle (in miles per hour) and the number 
 * of hours it has traveled. Use a loop to display 
 * the distance traveled for each hour of the 
 * time period specified by the user. The program 
 * should not accept negative numbers for speed or 
 * any value less than 1 for time traveled.
 */
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed, hours;

        // Input validation: Get speed from the user
        do {
            System.out.print("Enter the speed of the vehicle (in miles per hour): ");
            speed = scanner.nextInt();
            if (speed < 0) {
                System.out.println("Speed cannot be negative. Please enter a positive value.");
            }
        } while (speed < 0);

        // Input validation: Get the number of hours from the user
        do {
            System.out.print("Enter the number of hours the vehicle has traveled: ");
            hours = scanner.nextInt();
            if (hours < 1) {
                System.out.println("Time traveled must be at least 1 hour.");
            }
        } while (hours < 1);

        // Display the header
        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");

        // Loop to calculate and display the distance for each hour
        for (int i = 1; i <= hours; i++) {
            int distance = speed * i;
            System.out.println(i + "\t\t" + distance);
        }

        scanner.close();
    }
}

/**
 * Explanation:
	Input Validation:
	
	The program ensures the speed is not negative and the 
	number of hours is at least 1, as per the problem's 
	requirements.
	
	Loop:
	A for loop is used to calculate the distance traveled for 
	each hour, which is simply speed * hour.
	The results are displayed in a tabular format, with each 
	row showing the hour and the corresponding distance traveled.
	
	Output:
	The output includes a header and displays the hour along 
	with the calculated distance for that hour.
	
	Example Output:
	
	Enter the speed of the vehicle (in miles per hour): 40
	Enter the number of hours the vehicle has traveled: 3
	Hour    Distance Traveled
	-------------------------
	1       40
	2       80
	3       120

 */

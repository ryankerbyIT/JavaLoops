/**
 * Write a program that calculates the occupancy rate 
 * for each floor of a hotel. The program should ask 
 * the user for the number of floors in the hotel, then 
 * loop for each floor to ask the number of rooms on 
 * the floor and how many are occupied. Finally, display 
 * the total rooms, occupied rooms, vacant rooms, and the 
 * overall occupancy rate for the hotel.
 */
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRooms = 0, totalOccupiedRooms = 0;

        // Ask for the number of floors
        System.out.print("Enter the number of floors in the hotel: ");
        int floors = scanner.nextInt();

        // Input validation for floors
        while (floors < 1) {
            System.out.println("Number of floors must be at least 1.");
            System.out.print("Enter the number of floors in the hotel: ");
            floors = scanner.nextInt();
        }

        // Loop through each floor
        for (int i = 1; i <= floors; i++) {
            System.out.print("Enter the number of rooms on floor " + i + ": ");
            int roomsOnFloor = scanner.nextInt();

            // Input validation for rooms on the floor
            while (roomsOnFloor < 10) {
                System.out.println("The number of rooms must be at least 10.");
                System.out.print("Enter the number of rooms on floor " + i + ": ");
                roomsOnFloor = scanner.nextInt();
            }

            System.out.print("Enter the number of rooms occupied on floor " + i + ": ");
            int occupiedRooms = scanner.nextInt();

            // Accumulate total rooms and occupied rooms
            totalRooms += roomsOnFloor;
            totalOccupiedRooms += occupiedRooms;
        }

        // Calculate the total vacant rooms and occupancy rate
        int totalVacantRooms = totalRooms - totalOccupiedRooms;
        double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100;

        // Display the results
        System.out.println("\nTotal number of rooms: " + totalRooms);
        System.out.println("Total number of occupied rooms: " + totalOccupiedRooms);
        System.out.println("Total number of vacant rooms: " + totalVacantRooms);
        System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate);

        scanner.close();
    }
}

/**
 * Explanation:
	The program asks the user for the number of floors and then 
	for the number of rooms and occupied rooms on each floor.
	Input validation ensures that the number of floors is at least 
	1 and that the number of rooms on a floor is at least 10.
	After gathering the data, the program calculates and displays 
	the total rooms, occupied rooms, vacant rooms, and occupancy 
	rate as a percentage.
 */

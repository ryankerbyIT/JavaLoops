// Nested loops to draw the pattern:
public class Pattern1 {
	public static void main(String[] args) {
        // Outer loop for the rows
        for (int i = 7; i >= 1; i--) {
            // Inner loop for the stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

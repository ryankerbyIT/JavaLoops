// Nested loops to draw pattern:
public class Pattern2 {
	public static void main(String[] args) {
        int rows = 5;

        // Outer loop for the rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Inner loop for hash characters
            for (int k = rows; k >= i; k--) {
                System.out.print("#");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

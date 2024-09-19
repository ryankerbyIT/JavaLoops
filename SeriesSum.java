
public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0.0;

        // Loop through the series, calculating each term and adding to sum
        for (int i = 1; i <= 30; i++) {
            sum += (double) i / (31 - i);
        }

        // Output the total sum
        System.out.println("The total sum of the series is: " + sum);
    }
}
/**
Explanation:
The loop runs from i = 1 to i = 30.
In each iteration, the term i / (31 - i) is calculated and added to the sum.
The result is printed after the loop finishes.
**/
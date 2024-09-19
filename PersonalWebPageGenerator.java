/**
 * The program asks the user for their name and a 
 * description of themselves. It then generates an 
 * HTML file that displays this information.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PersonalWebPageGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for user's description
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        // Create an HTML file
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("personal_webpage.html"));

            // Write HTML content to the file
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>" + name + "'s Personal Web Page</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<center><h1>" + name + "</h1></center>");
            writer.println("<hr />");
            writer.println("<p>" + description + "</p>");
            writer.println("<hr />");
            writer.println("</body>");
            writer.println("</html>");

            writer.close();
            System.out.println("Web page created successfully: personal_webpage.html");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the web page.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

/**
 * Explanation:
The program asks the user for their name and a description.
It generates an HTML file called personal_webpage.html that 
contains this information in a simple HTML structure.
The user's name is displayed as a heading (<h1>), and the 
description is displayed as a paragraph (<p>).

			Example Output in HTML:
			
			<html>
<head>
    <title>Julie Taylor's Personal Web Page</title>
</head>
<body>
    <center><h1>Julie Taylor</h1></center>
    <hr />
    <p>I am a computer science major, a member of the Jazz club, and I hope to work as a mobile app developer after I graduate.</p>
    <hr />
</body>
</html>

 */


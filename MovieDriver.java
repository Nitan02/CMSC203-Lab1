import java.util.Scanner;

public class MovieDriver {
	// Make this MovieDriver as main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to input multiple movies
        while (true) {
            // Create a new Movie object out of Movie.java
            Movie movie = new Movie();

            // Prompt user to enter movie title
            System.out.println("Enter the title of the movie:");
            String title = scanner.nextLine();
            movie.setTitle(title); // Called title from movie object

            // Prompt user to enter movie rating
            System.out.println("Enter the rating of the movie:");
            String rating = scanner.nextLine();
            movie.setRating(rating); // Called rating from movie object

            // Prompt user to enter number of tickets sold
            System.out.println("Enter the number of tickets sold for the movie:");
            int ticketsSold = scanner.nextInt();
            movie.setSoldTickets(ticketsSold); // Called soldTikets from movie object

            // Consume newline character after reading integer
            scanner.nextLine();

            // Print movie information
            System.out.println(movie); //Print the toString from movie object
            
            // Ask user if they want to continue
            System.out.println("Do you want to enter another movie? (y/n)");
            String continueResponse = scanner.nextLine();
            if (!continueResponse.equalsIgnoreCase("y")) {
                break; // Exit loop if user does not want to continue
            }
        }

        System.out.println("Goodbye");
    }
}
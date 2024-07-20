package technohacks;
import java.util.Random;
import java.util.Scanner;
//Class Declaration
public class RockPaperScissorsGame {
	//Main Method
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
     // Read the user's choice
        Random random = new Random();

        // Array of choices for the computer
        String[] choices = {"rock", "paper", "scissors"};

        // Prompt user for their choice
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase(); // Convert to lower case for case insensitivity

        // Validate user input
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
        } else {
            // Generate a random choice for the computer
            int index = random.nextInt(3); // 0 = rock, 1 = paper, 2 = scissors
            String computerChoice = choices[index];

            // Display computer's choice
            System.out.println("Computer chooses: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        //Closing Scanner Class
        scanner.close();
    }
}

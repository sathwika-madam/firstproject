package technohacks;
import java.util.Random;
import java.util.Scanner;
//Class Declaration
public class Number_Guessing_Game {
	//Main Method
    public static void main(String[] args) {
    	
        // Prompt the user to guess a number below 100
        System.out.println("Guess a number below 100");
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in); 
        
        // Read the user's guess
        int num = sc.nextInt();       
        // Generate a random number between 0 (inclusive) and 100 (exclusive)
        Random random = new Random();
        int target = random.nextInt(100);      
        // Continue looping until the user's guess matches the target number
        
        while (num != target) {
            // Check if the user's guess is greater than the target number
            if (num > target) {
                System.out.println("Your guess is greater, guess again");
            } else { // If not greater, it must be lower
                System.out.println("Your guess is lower, guess again");
            }        
            
            // Prompt the user to guess again and read the new guess
            num = sc.nextInt();
        } 
        // Print congratulations message when the correct guess is made
        System.out.println("Your guess is correct, congrats!!");        
        // Close the scanner to release resources
        sc.close();
    }
}

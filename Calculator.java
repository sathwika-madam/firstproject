package technohacks;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
		System.out.println(" BASIC CALCULATOR");

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble(); // Read the first number
        
        // Prompt the user to enter the second number
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble(); // Read the second number
        
        // Prompt the user to enter an operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read the operator        
        // Variable to store the result of the operation
        double result;
        
        // Switch statement to perform the operation based on the operator
        switch (operator) {
            case '+':
            	System.out.println("Sum");
            	// Addition
                result = num1 + num2;
                break;
            case '-':
            	System.out.println("Difference");
            	//Subtraction
                result = num1 - num2;
                break;
            case '*':
            	System.out.println("Product");
            	//Multiplication
                result = num1 * num2; 
                break;
            case '/':
            	System.out.println("Division");
                // Check if the second number is not zero to avoid division by zero
                if (num2 != 0) {
                    result = num1 / num2; // Division
                } else {
                    System.out.println("Error! Division by zero."); // Error message for division by zero
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Invalid operator!"); // Error message for invalid operator
                return; // Exit the program
        }
        // Print the result of the operation
        System.out.println("The result is: " + result);

    }
}

 //Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
import java.util.Scanner;

public class FIRST_java_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        // Perform calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            scanner.close();
            return;
        }
        
        // Output the result
        System.out.printf("Result: %.2f%n", result);
        
        // Close the scanner
        scanner.close();
    }
}

//  Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

import java.util.Scanner;

public class FIRST_java_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal, time, and rate
        System.out.print("Enter principal (P): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter time in years (T): ");
        double time = scanner.nextDouble();
        
        System.out.print("Enter rate of interest (R): ");
        double rate = scanner.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;
        
        // Output the result
        System.out.printf("Simple Interest is: %.2f%n", simpleInterest);
        
        // Close the scanner
        scanner.close();
    }
}
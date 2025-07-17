//Write a program to print whether a number is even or odd, also take
//input from the user.
import java.util.Scanner;
public class FIRST-java-Q1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();
}

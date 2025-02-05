//Solution to all the code question
import java.util.*;
public class Assignment2firstjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Even or Odd Check
        System.out.print("Enter a number to check even or odd: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // 2. Greeting Message
        System.out.print("Enter your name: ");
        sc.nextLine(); // To consume the leftover newline
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java program.");

        // 3. Simple Interest Calculation
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();
        double simpleInterest = (P * T * R) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        // 4. Basic Calculator
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0)
                System.out.println("Result: " + (num1 / num2));
            else
                System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("Invalid operator.");
        }

        // 5. Largest Number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Largest number is: " + (a > b ? a : b));

        // 6. Currency Conversion (INR to USD)
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        double usd = inr / 82.5; // Assuming 1 USD = 82.5 INR
        System.out.println("Equivalent USD: $" + usd);

        // 7. Fibonacci Series
        System.out.print("Enter the number of terms for Fibonacci Series: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        // 8. Palindrome Check
        System.out.print("Enter a string to check if it's a palindrome: ");
        sc.nextLine(); // Consume leftover newline
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        // 9. Armstrong Numbers Between Two Given Numbers
        System.out.print("Enter the lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int high = sc.nextInt();
        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces & lowercase
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }
}

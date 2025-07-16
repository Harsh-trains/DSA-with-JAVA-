//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class FLOW_Q5_Krish 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int sum = 0;
        String input;
        
        System.out.println("Enter numbers to sum them up. Type 'x' to finish:");
        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'x' to exit.");
            }
        }
        
        System.out.println("The total sum is: " + sum);
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}

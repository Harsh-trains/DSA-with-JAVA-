// Take 2 numbers as inputs and find their HCF and LCM.
public class FLOW_Q4_Krish
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;
        
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
    
    private static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }   
}

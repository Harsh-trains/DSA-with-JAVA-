// Take name as input and print a greeting message for that particular name.
class Q2 
{
    public static void main(String[] args) {    
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello, " + name + "! Welcome to the program.");
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }               
}

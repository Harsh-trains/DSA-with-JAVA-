import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // program to even and odd 
            // defining the scanner
            Scanner input = new Scanner(System.in);
            // int a ,b;
            // System.out.println("enter the number");
            // a = input.nextInt();
            // if(a%2==0){
            //     System.out.println("the number is  even");
            // }else{
            //     System.out.println("the number is odd");
            // } assignment 1.1
            
//            String name ;
//            name = input.next();
//            String greet = "hello"+name;
//            // System.out.println(greet);

// calc
        System.out.println("enter two number");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("enter the operator");
        String ch = input.next();
        if(ch == "+"){
            System.out.println(a+b);
        } else if (ch == "-") {
            System.out.println(a-b);
        } else if (ch == "*") {
            System.out.println(a*b);

        }else{
            System.out.println("worng input");
        }


    }
}

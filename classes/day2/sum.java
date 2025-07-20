package day2;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("enter the first number "));
        int num1 = sc.nextInt();

        System.out.print(("enter the second number "));
        int num2 = sc.nextInt();
        int sum = num2+num1;

        System.out.println("the additon is "+ sum);


    }
}

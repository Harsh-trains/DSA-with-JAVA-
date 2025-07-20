package day2;

import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("enter the celcius ");
        float tempC = ip.nextFloat();

  float tempF = (tempC * 9/5)+32;
  System.out.println("the temp in f is: "+ tempF);

    }
}

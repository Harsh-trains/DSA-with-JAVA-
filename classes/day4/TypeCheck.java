import java.util.Scanner;
public class TypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);
            if(ch =='a' && ch<='z'){
                System.out.println("this is lowercase");
            }else{
                System.out.println("this is lowerCase");
            }

        
    }
}

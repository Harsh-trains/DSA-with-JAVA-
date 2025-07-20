import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b =1;
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int temp =b;
            b = a+b;
            a = temp;
            System.out.println(b);

        }  
        System.out.println(b+"this is the FIBI");
    }
    
}

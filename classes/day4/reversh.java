public class reversh {
    public static void main(String[] args) {
        int n = 123;
        int temp = 123;

        int rev =0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;

        }
        System.out.println(("this is the reversh "+ rev));
        System.out.println(("this is the org "+ temp));

    }
}

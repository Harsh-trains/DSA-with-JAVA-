public class countingOccurence {
    public static void main(String[] args) {
        int number = 17385789;
        int cnt =0;

        while(number>0){

        int lastDigit = number%10;
        number = number/10;
        if(lastDigit ==7){
            cnt++;
        }

            }

            System.out.println(cnt);
    }
}

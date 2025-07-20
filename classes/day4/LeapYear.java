public class LeapYear {
    public static void main(String[] args) {
        int date = 2025;
        // System.out.println(leapYear(date));
        System.out.println(leapYear(date));
    }
    public static boolean leapYear(int num){

        // leap year must be divisible by 4 ;
        // leap year must be divisble by 400 ;
        // and it is not divisible by 100;
        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            return true;
        }

    return false;

    }
}

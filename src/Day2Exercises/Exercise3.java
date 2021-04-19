package Day2Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
    {

        System.out.print("Input an integer: ");
        int digits = 25;
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}

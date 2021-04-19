package Day2Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args)
    {

        System.out.print("Input a year: ");
        int year = 2017;

        System.out.println(is_LeapYear(year));
    }

    public static boolean is_LeapYear(int y)
    {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));

        return a && (b || c);
    }
}

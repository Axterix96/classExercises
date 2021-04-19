package Day2Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        System.out.print("Input the investment amount: ");
        double investment = 1000;

        System.out.print("Input the rate of interest: ");
        double rate = 10;

        System.out.println("Input number of years: ");
        int year = 5;

        rate *= 0.01;

        System.out.println("Years    FutureValue");
        for(int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i < 11) formatter = 18;
            System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}

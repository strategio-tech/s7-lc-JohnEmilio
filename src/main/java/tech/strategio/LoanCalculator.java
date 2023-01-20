package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * This method will take in an integer as an input and will calculate the total amount of the loan remaining after three months.
     * The method can be used in three month increments but by simply changing the totalPayments argument in the while loop, it can be used for various lengths of time.
     *
     * @param amount is an integer for the total loan amount
     * @return amountRemaining is a double that will hold the total amount of the loan remaining after payments. This is declared as a double, but converted to an integer using TypeCasting
     */
    static int getRemainingAmountIn3Months(int amount) {
        int totalPayments = 0;
        double amountRemaining = amount;
        while (totalPayments < 3){
            amountRemaining = amountRemaining - (amountRemaining * .1);
            totalPayments++;
        }
        return (int)amountRemaining;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}

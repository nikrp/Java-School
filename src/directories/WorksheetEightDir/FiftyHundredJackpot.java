package directories.WorksheetEightDir;

import java.util.Scanner;

public class FiftyHundredJackpot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for 50-100 input
        System.out.print("Enter a number between 50 and 100 (inclusive): ");
        int jackpotNum = in.nextInt();

        if (jackpotNum < 50 || jackpotNum > 100) {
            System.out.println("\nSorry, you are not following directions!");
        } else {
            String dollarsPlural = (jackpotNum == 1) ? " dollar!" : " dollars!";
            System.out.println("\nYou won " + jackpotNum + dollarsPlural);
        }
    }
}

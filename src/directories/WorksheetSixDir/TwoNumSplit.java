package directories.WorksheetSixDir;

import java.util.Scanner;

public class TwoNumSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int twoDigitNum;

        System.out.print("Enter a two digit number: ");
        twoDigitNum = in.nextInt();

        while (WorksheetSix.countDigits(twoDigitNum) != 2) {
            System.out.println("It has to be a two digit number!");
            System.out.print("Enter a two digit number: ");
            twoDigitNum = in.nextInt();
        }

        int digitOne = twoDigitNum % 10;
        int digitTwo = twoDigitNum / 10;

        System.out.println("\nResults (Right to Left):\nFirst Number: " + digitOne + "\nSecond Number: " + digitTwo + "\n");
    }
}

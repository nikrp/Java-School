package directories.WorksheetSixDir;

import java.util.Scanner;

public class ThreeNumSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int threeDigitNum;

        System.out.print("Enter a three digit number: ");
        threeDigitNum = in.nextInt();

        while (WorksheetSix.countDigits(threeDigitNum) != 3) {
            System.out.println("Has to be 3 digits!");
            System.out.print("Enter a three digit number: ");
            threeDigitNum = in.nextInt();
        }

        int digitOne = threeDigitNum % 10;
        int digitTwo = (threeDigitNum / 10) % 10;
        int digitThree = (threeDigitNum / 10) / 10;

        System.out.println("\nResults (Right to Left):\nFirst Number: " + digitOne + "\nSecond Number: " + digitTwo + "\nThird Number: " + digitThree + "\n");
    }
}

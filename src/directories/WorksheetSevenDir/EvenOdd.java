package directories.WorksheetSevenDir;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        int pInt = in.nextInt();

        if (pInt < 0) {
            System.out.println("\nHas to be a positive integer!");
        } else {
            if (pInt % 2 == 0) {
                System.out.println("\nYou have an even integer!");
            } else {
                System.out.println("\nYou have an odd integer!");
            }
        }
    }
}
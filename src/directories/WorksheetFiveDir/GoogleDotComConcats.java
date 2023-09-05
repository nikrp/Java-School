package directories.WorksheetFiveDir;

import java.util.Scanner;

public class GoogleDotComConcats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        lastName += "@google.com";

        System.out.println("\n" + lastName);
    }
}

package directories.WorksheetSevenDir;

import java.util.Scanner;

public class CanDrive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("");

        System.out.print("Please enter your age: ");
        int age = in.nextInt();

        if (age > 16) {
            System.out.println("\nIt's scary, " + name + "... you are old enough to drive!");
        } else {
            int yearsLeft = 17 - age;
            System.out.println("\nYou need to wait " + yearsLeft + " years to drive!");
        }
    }
}

package directories.WorksheetFourDir;

import java.util.Scanner;

public class HeightCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inches;
        int feet;

        System.out.print("Enter Height in Inches: ");
        inches = in.nextInt();
        
        feet = Math.floorDiv(inches, 12);
        inches = inches % 12;
        
        System.out.println("\n" + feet + " Feet and " + inches + " Inches.\n----------------------------------------");
    }
}

package directories.WorksheetFourDir;

import java.util.Scanner;

public class MilesGallons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double miles;
        double gallons;

        System.out.print("Enter Miles Driven: ");
        miles = in.nextDouble();

        System.out.print("Enter Gallons Purchased: ");
        gallons = in.nextDouble();

        double mpg = miles / gallons;

        System.out.println("\n" + mpg + " Miles Per Gallon.\n----------------------------------------");
    }
}

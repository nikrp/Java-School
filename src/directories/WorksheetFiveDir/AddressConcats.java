package directories.WorksheetFiveDir;

import java.util.Scanner;

public class AddressConcats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Commenting these out even though they are in the assignment. IDE just giving a very triggering (annoying) error.
        // System.out.print("Enter your name: ");
        // String name = in.nextLine();

        // System.out.print("\nEnter your address (this information in not saved anywhere): ");
        // String address = in.nextLine();

        System.out.print("\nEnter your city, state, and zip: ");
        String cityStateZip = in.nextLine();

        String cityName = cityStateZip.split(",")[0].trim();
        int cityNameLength = cityName.length();

        System.out.println("\nThe length of " + cityName + " is " + cityNameLength + " characters.\n");
    }
}

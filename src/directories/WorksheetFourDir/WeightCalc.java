package directories.WorksheetFourDir;

import java.util.Scanner;

public class WeightCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int oz;
        int lb;

        System.out.print("Enter Weight In Ounces: ");
        oz = in.nextInt();

        lb = Math.floorDiv(oz, 12);
        oz = oz % 12;

        System.out.println("\n" + lb + " Pounds and " + oz + " Ounces.\n----------------------------------------");
    }
}

package directories.WorksheetFourDir;

import java.util.Scanner;

public class StringConcats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        String favColor;

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.print("Enter your favorite color: ");
        favColor = in.nextLine();

        System.out.println("\n" + name + ", your favorite color is " + favColor + ".\n----------------------------------------");
    }
}

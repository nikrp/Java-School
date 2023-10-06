package directories.WorksheetEightDir;

import java.util.Scanner;

public class VirusChances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for proceed confirmation
        System.out.print("This program may contain a virus. Do you wish to continue (y/n)?: ");
        char yesNo = in.next().charAt(0);
        yesNo = Character.toLowerCase(yesNo);

        // Check if input is valid
        switch (yesNo) {
            case 'y':
                System.out.println("\nYou are a gambler!");
                break;
            case 'n':
                System.out.println("\nSmart choice!");
                break;
            default:
                System.out.println("\nThat was not a Y or N. You did not answer correctly! We are in the process of uploading a virus to your computer right now. Have fun!");
                break;
        }
    }
}

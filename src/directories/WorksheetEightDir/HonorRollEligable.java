package directories.WorksheetEightDir;

import java.util.Scanner;

public class HonorRollEligable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask average grade
        System.out.print("Enter your average grade: ");
        double averageGrade = in.nextDouble();

        // Ask # of courses
        System.out.print("Enter the amount of courses you are taking: ");
        int courses = in.nextInt();

        // Ask discipline infractions
        System.out.print("Do you have any disciplinary infractions?: ");
        String disciplinaryActions = in.next();

        if (averageGrade > 90 && courses >= 5 && disciplinaryActions.equalsIgnoreCase("no")) {
            System.out.println("\nYou're eligable for the honor roll!");
        } else {
            System.out.println("\nSorry, you are not eligable for the honor roll. :(");
        }
    }
}

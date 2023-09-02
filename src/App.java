import directories.WorksheetOneDir.WorksheetOne;
import directories.WorksheetTwoDir.WorksheetTwo;
import directories.WorksheetThreeDir.WorksheetThree;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean mainProjectDirRunning = true;

    while (mainProjectDirRunning) {
      try {
        System.out.print("Enter the directory number and 0 to terminate: ");
        int projectNum = in.nextInt();

        if (projectNum == 0) {
          mainProjectDirRunning = false; // Exit the loop
        } else if (projectNum >= 1 && projectNum <= 3) {
          System.out.print("\n");
          callDir(projectNum, args);
        } else {
          System.out.println("Invalid input. Please enter a number between 1 and 3.");
        }
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid integer.");
        in.nextLine(); // Consume the invalid input to avoid an infinite loop
      }
    }

    in.close();
    System.out.println("Exiting...");
    System.exit(0);
  }

  public static void callDir(int projectNum, String[] args) {
    switch (projectNum) {
      case 1:
        WorksheetOne.main(args);
        break;
      case 2:
        WorksheetTwo.main(args);
        break;
      case 3:
        WorksheetThree.main(args);
        break;
    }
  }
}

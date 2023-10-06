import directories.WorksheetOneDir.WorksheetOne;
import directories.WorksheetTwoDir.WorksheetTwo;
import directories.WorksheetThreeDir.WorksheetThree;
import directories.WorksheetFourDir.WorksheetFour;
import directories.WorksheetFiveDir.WorksheetFive;
import directories.WorksheetSixDir.WorksheetSix;
import directories.WorksheetSevenDir.WorksheetSeven;
import directories.WorksheetEightDir.WorksheetEight;

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
        } else if (projectNum >= 1 && projectNum <= 8) {
          System.out.print("\n");
          callDir(projectNum, args);
        } else {
          System.out.println("Invalid input. Please enter a number between 1 and 8 (inclusive).");
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
      case 4:
        WorksheetFour.main(args);
        break;
      case 5:
        WorksheetFive.main(args);
        break;
      case 6:
        WorksheetSix.main(args);
        break;
      case 7:
        WorksheetSeven.main(args);
        break;
      case 8:
        WorksheetEight.main(args);
        break;
    }
  }
}

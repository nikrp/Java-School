package directories.WorksheetSevenDir;

import java.util.Scanner;

public class WorksheetSeven {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean wkSevenDone = false;

    System.out.println("Your are in \"Worksheet Seven: Conditionals Part 1\"");

    while (!wkSevenDone) {
      try {
        System.out.print("Enter a project number: ");
        int projectNum = in.nextInt();

        System.out.println("");

        if (projectNum == 0) {
          wkSevenDone = true;
          continue;
        } else if (projectNum >= 1 && projectNum <= 6) {
          callProject(projectNum, args);
        }
      } catch (Exception e) {
        in.nextLine();
      }
    }
  }

  public static void callProject(int projectNum, String[] args) {
    switch (projectNum) {
      case 1:
        CanDrive.main(args);
        break;
      case 2:
        EvenOdd.main(args);
        break;
      case 3:
        TelegramCost.main(args);
        break;
      case 4:
        TwoNumAscending.main(args);
        break;
      case 5:
        ArtMuseumEntryFee.main(args);
        break;
      case 6:
        JukeboxRally.main(args);
        break;
    }
  }
}

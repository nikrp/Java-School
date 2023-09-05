package directories.WorksheetFiveDir;

import java.util.Scanner;

import directories.WorksheetFourDir.RandomCalcs;

public class WorksheetFive {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean wkFiveDone = false;

    System.out.println("Your are in \"Worksheet Five: String Operations\"");

    while (!wkFiveDone) {
      try {
        System.out.print("Enter a project number: ");
        int projectNum = in.nextInt();

        System.out.println("");

        if (projectNum == 0) {
          wkFiveDone = true;
          continue;
        } else if (projectNum >= 1 && projectNum <= 5) {
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
        GoogleDotComConcats.main(args);
        break;
      case 2:
        StringOverride.main(args);
        break;
      case 3:
        AddressConcats.main(args);
        break;
      case 4:
        BusinessNameToNormal.main(args);
        break;
      case 5:
        PhraseOperations.main(args);
        break;
    }
  }
}

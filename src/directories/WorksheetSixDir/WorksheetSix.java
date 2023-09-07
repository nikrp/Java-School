package directories.WorksheetSixDir;

import java.util.Scanner;

public class WorksheetSix {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean wkSixDone = false;

    System.out.println("Your are in \"Worksheet Six: Integer Operations\"");

    while (!wkSixDone) {
      try {
        System.out.print("Enter a project number: ");
        int projectNum = in.nextInt();

        System.out.println("");

        if (projectNum == 0) {
          wkSixDone = true;
          continue;
        } else if (projectNum >= 1 && projectNum <= 3) {
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
        VolleyballTeamCalcs.main(args);
        break;
      case 2:
        TwoNumSplit.main(args);
        break;
      case 3:
        ThreeNumSplit.main(args);
        break;
    }
  }

  public static int countDigits(int num) {
    int temp = 1;
    int count = 0;

    while (temp <= num) {
        temp *= 10;
        count  += 1;
    }

    return count;
  }
}

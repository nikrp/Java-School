package directories.WorksheetTwoDir;

import java.util.Scanner;

public class WorksheetTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean wkTwoDone = false;

        System.out.println("Your are in \"Worksheet Two: Backslash Characters\"");

        while (!wkTwoDone) {
            try {
                System.out.print("Enter a project number: ");
                int projectNum = in.nextInt();

                if (projectNum == 0) {
                wkTwoDone = true;
                continue;
                } else if (projectNum >= 1 && projectNum <= 3) {
                callProject(projectNum, args);
                }
            } catch (Exception e) {
                System.out.println("Bye");
                wkTwoDone = true;
            }
        }
    }

  public static void callProject(int projectNum, String[] args) {
    switch (projectNum) {
      case 1:
        TwentyThreeSpaces.main(args);
        break;
      case 2:
        FidgetCompany.main(args);
        break;
      case 3:
        AboutMe.main(args);
        break;
    }
  }
}

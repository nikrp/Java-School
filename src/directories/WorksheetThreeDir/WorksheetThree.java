package directories.WorksheetThreeDir;

import java.util.Scanner;

public class WorksheetThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean wkThreeDone = false;

        System.out.println("Your are in \"Worksheet Three: More Backslash Characters\"\n");

        while (!wkThreeDone) {
            try {
                System.out.print("Enter a project number: ");
                int projectNum = in.nextInt();

                if (projectNum == 0) {
                wkThreeDone = true;
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
        JavaCompWinners.main(args);
        break;
      case 2:
        OddString.main(args);
        break;
      case 3:
        StudentNameId.main(args);
        break;
    }
  }
}

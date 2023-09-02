package directories.WorksheetOneDir;
import java.util.Scanner;

public class WorksheetOne {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean wkOneDone = false;

    System.out.println("Your are in \"Worksheet One: Printing\"");

    while (!wkOneDone) {
      try {
        System.out.print("Enter a project number: ");
        int projectNum = in.nextInt();

        if (projectNum == 0) {
          wkOneDone = true;
          continue;
        } else if (projectNum >= 1 && projectNum <= 3) {
          callProject(projectNum, args);
        }
      } catch (Exception e) {
        System.out.println("Bye");
        wkOneDone = true;
      }
    }
  }

  public static void callProject(int projectNum, String[] args) {
    switch (projectNum) {
      case 1:
        QuoteName.main(args);
        break;
      case 2:
        NameChart.main(args);
        break;
      case 3:
        AsteriskPattern.main(args);
        break;
    }
  }
}
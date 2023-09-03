package directories.WorksheetFourDir;
import java.util.Scanner;

public class WorksheetFour {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean wkFourDone = false;

    System.out.println("Your are in \"Worksheet Four: Scanner Class\"");

    while (!wkFourDone) {
      try {
        System.out.print("Enter a project number: ");
        int projectNum = in.nextInt();

        System.out.println("");

        if (projectNum == 0) {
          wkFourDone = true;
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
        ScoreYearCalc.main(args);
        break;
      case 2:
        HeightCalc.main(args);
        break;
      case 3:
        WeightCalc.main(args);
        break;
      case 4:
        MilesGallons.main(args);
        break;
      case 5:
        RandomCalcs.main(args);
        break;
      case 6:
        StringConcats.main(args);
        break;
    }
  }
}
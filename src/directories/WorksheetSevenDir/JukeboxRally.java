package directories.WorksheetSevenDir;

import java.util.Scanner;

public class JukeboxRally {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("What is your year of birth?: ");
    int birthYear = in.nextInt();

    if (birthYear < 1970) {
      System.out.println("\nYou are eligible for the Juke Box Rally!");
    }

    // Consume the Blank Line that is Printed
    String blank = in.nextLine();

    System.out.print("\nWhat is your favorite fruit?: ");
    String favFruit = in.nextLine();

    if (favFruit.toLowerCase().equals("strawberry")) {
      System.out.println("\nStrawberry Fields Forever");
    } else {
      System.out.println("\nBye, bye Miss American Pie");
    }
  }
}

package directories.WorksheetSevenDir;

import java.util.Scanner;

public class ArtMuseumEntryFee {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("What is your age?: ");
    int age = in.nextInt();

    if (age < 5) {
      System.out.println("\nAdmission: Free");
    } else if (age >= 65) {
      System.out.println("\nAdmission: $1.50");
    } else {
      System.out.println("\nAdmission: $2.50");
    }
  }
}
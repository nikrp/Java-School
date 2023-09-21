package directories.WorksheetSevenDir;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TwoNumAscending {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Integer> numList = new ArrayList();

    System.out.print("What is the first number?: ");
    numList.add(in.nextInt());

    System.out.print("What is the second number?: ");
    numList.add(in.nextInt());

    if (numList.get(0) == numList.get(1)) {
      System.out.println("\nThe numbers you entered are equal!");
    } else {
      Collections.sort(numList);
      for (int num : numList) {
        System.out.print(num + " ");
      }
    }
    System.out.println("");
  }
}

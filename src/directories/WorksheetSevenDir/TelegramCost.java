package directories.WorksheetSevenDir;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TelegramCost {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("How many words was your telegram: ");
    int wordAmt = in.nextInt();

    double endAmt = 0.00;

    if (wordAmt <= 15) {
      endAmt += 8.5;
    } else {
      endAmt += 8.5;
      wordAmt -= 15;
      endAmt += .25 * wordAmt;
    }

    NumberFormat formatter = new DecimalFormat("#0.00");
    System.out.println("\nYour telegram was $" + formatter.format(endAmt) + " in total.");
  }
}
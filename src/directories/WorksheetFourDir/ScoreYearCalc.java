package directories.WorksheetFourDir;

import java.util.Scanner;

public class ScoreYearCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;
        int score;

        System.out.print("Enter an amount of years to calculate: ");
        year = in.nextInt();

        score = Math.floorDiv(year, 20);
        year = year % 20;

        System.out.println("\n" + score + " Scores and " + year + " Years Ago.\n----------------------------------------");
    }
}

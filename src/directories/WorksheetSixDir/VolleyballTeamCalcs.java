package directories.WorksheetSixDir;

import java.util.Scanner;

public class VolleyballTeamCalcs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int players;
        int teams;

        System.out.print("Enter Player Count: ");
        players = in.nextInt();

        teams = players / 7;
        players = players % 7;

        System.out.println("\n" + teams + " Teams and " + players + " Players Remaining.\n");
    }
}

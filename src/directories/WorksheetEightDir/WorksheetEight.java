package directories.WorksheetEightDir;

import java.util.Scanner;

public class WorksheetEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        System.out.println("Your are in \"Worksheet Eight: Conditionals Part 2\"");
        
        while (running) {
            try {
                System.out.print("Enter the project number: ");
                int projectNum = in.nextInt();

                System.out.println("");

                if (projectNum == 0) {
                    running = false;
                    continue;
                } else if (projectNum >= 1 && projectNum <= 4) {
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
                ThreeSides.main(args);
                break;
            case 2:
                FiftyHundredJackpot.main(args);
                break;
            case 3:
                VirusChances.main(args);
                break;
            case 4:
                HonorRollEligable.main(args);
                break;
        }
    }
}

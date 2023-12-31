import java.util.Scanner;

import projects.MovieMenu;
import projects.PaintStore;
import projects.PiggyBankProgram;

public class Projects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.print("Enter the Unit Project to Run (0 to exit): ");
                int projectNum = in.nextInt();

                System.out.println("\n");

                if (projectNum == 0) {
                    running = false;
                    continue;
                } else if (projectNum >= 1 && projectNum <= 3) {
                    callProject(projectNum, args);
                } else {
                    System.out.println("Enter a number between 1 and 3 (inclusive)!");
                }
            } catch (Exception e) {
                in.nextLine();
            }
        }

        System.out.println("Exiting...");
        in.close();
        System.exit(0);
    }

    public static void callProject(int projectNum, String[] args) {
        switch (projectNum) {
            case 1:
                MovieMenu.main(args);
                break;
            case 2:
                PiggyBankProgram.main(args);
                break;
            case 3:
                PaintStore.main(args);
        }
    }
}

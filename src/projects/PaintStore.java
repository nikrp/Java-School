/*
 * Author: Nikhil Pellakuru
 * Start Date: 11/3/2023 at 11:23 AM Pacific Time
 * End Date: 11/3/2023 at 5:00 PM Pacific Time

 * Project Name: Paint Store
 * Project Description: This project simulates a paint store with two different colors
 *                      at different prices. This project helps programmers practice methods, error trapping, 

 * Libraries: java.util (Scanner)
 * Files: Main.java
*/

// Package the Project so it's Available to Projects.java Outside this Directory
package projects;

// Import Required Modules
import java.util.*;

public class PaintStore {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String color = "";
    int fullG = 0;
    double rCost = 0.00, gCost = 0.00;

    boolean morePaint = true;

    while (morePaint) {
        do {
            try {
                color = strInput("What color paint would you like? (red/green): ");
            } catch (Exception e) {
            }
        } while (!(color.toLowerCase().equals("red")) && !(color.toLowerCase().equals("green")));    

        do {
            try {
                fullG = intInput("How many full gallons do you need?: ");
            } catch (Exception e) {
            }
        } while (fullG <= 0);

        color = color.toLowerCase();

        switch (color) {
            case "green":
                gCost += green(fullG);
                break;
            case "red":
                rCost += red(fullG);
                break;
        }

        char morePaintYN = 'y';

        do {
            morePaintYN = charInput("More paint? (y/n): ");
        } while (Character.toLowerCase(morePaintYN) != 'y' && Character.toLowerCase(morePaintYN) != 'n');

        switch (Character.toLowerCase(morePaintYN)) {
            case 'y':
                morePaint = true;
                break;
            default:
                morePaint = false;
        }
    }

    double cost = rCost + gCost;
    double tCost = cost * 0.09;
    
    // Print Table Here
    final int basePadding = 98; // Universal Padding (for the table) to base all value off

    System.out.print(ConsoleColors.RESET);
    System.out.println("-".repeat(basePadding));
    System.out.printf("| %" + ((Math.floorDiv(basePadding, 2))) + "s%-" + ((Math.floorDiv(basePadding, 2)) - (basePadding % 2 == 0 ? 3 : 2)) + "s|%n", "The Store", "");
    System.out.println("-".repeat(basePadding));
    System.out.printf("| " + ConsoleColors.BLUE_BOLD + "Subtotal: $%-" + (basePadding - 14) + ".2f" + ConsoleColors.RESET + "|%n", cost);
    System.out.printf("| " + ConsoleColors.YELLOW_BOLD + "Sales Tax: %-" + (basePadding - 14) + "s" + ConsoleColors.RESET + "|%n", "9%");
    System.out.printf("| " + ConsoleColors.GREEN_BOLD + "Total: $%-" + (basePadding - 11) + ".2f" + ConsoleColors.RESET + "|%n", tCost);
    System.out.println("-".repeat(basePadding));
    System.out.printf("| " + ConsoleColors.PURPLE + "%-" + (basePadding - 3) + "s" + ConsoleColors.RESET + "|%n", "Thank you for shopping!");
    System.out.println("-".repeat(basePadding));

  }

  // Paint Selection Methods
  public static double red(int fG) {
    return Double.parseDouble(Integer.toString(fG)) * 21.95;
  }
  public static double green(int fG) {
    return Double.parseDouble(Integer.toString(fG)) * 19.95;
  }

  // Scanner Methods
  public static String strInput(String prompt) {
    Scanner sc = new Scanner(System.in);

    System.out.print(prompt);
    String daInput = sc.nextLine();
    
    return daInput;
  }
  public static int intInput(String prompt) {
    Scanner sc = new Scanner(System.in);

    System.out.print(prompt);
    int daInput = sc.nextInt();
    
    return daInput;
  }
  public static double floatInput(String prompt) {
    Scanner sc = new Scanner(System.in);

    System.out.print(prompt);
    double daInput = sc.nextDouble();
    
    return daInput;
  }
  public static char charInput(String prompt) {
    Scanner sc = new Scanner(System.in);

    System.out.print(prompt);
    char daInput = sc.nextLine().charAt(0);
    
    return daInput;
  }
  public static void consume() {
    Scanner sc = new Scanner(System.in);

    sc.nextLine();
  }
}
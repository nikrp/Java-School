package directories.WorksheetEightDir;

import java.util.Scanner;

public class ThreeSides {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask for side #1
        System.out.print("Enter side 1: ");
        double sideOne = in.nextDouble();

        // Ask for side #2
        System.out.print("Enter side 2: ");
        double sideTwo = in.nextDouble();

        // Ask for side #3
        System.out.print("Enter side 3: ");
        double sideThree = in.nextDouble();

        // Check for triangle
        if (sideOne + sideTwo > sideThree || sideOne + sideThree > sideTwo || sideTwo + sideThree > sideOne) {
            if (sideOne == sideTwo || sideOne == sideThree || sideThree == sideTwo) {
                System.out.println("\nYour lengths make an isosceles triangle!");
            } else if (sideOne != sideTwo && sideOne != sideTwo && sideTwo != sideThree) {
                System.out.println("\nYour lengths make a scalene triangle!");
            } else {
                System.out.println("\nYour lengths make an equilateral triangle!");
            }
        } else {
            System.out.println("\nYour sides don't make a triangle!");
        }
    }
}

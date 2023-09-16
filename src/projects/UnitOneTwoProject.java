/*
 * Author: Nikhil Pellakuru
 * Start Date: 9/15/2023 at 3:58 PM Pacific Time
 * End Date: 9/12/2023 at 5:00 PM Pacific Time

 * Project Name: Movie Menu
 * Project Description: This project asks the user for six inputs. Three movie prices and
   how many are in stock at a store (imaginary). Then the program shows the data in a formatted
   table using printf and also shows the average price of the movies including how many are in stock
   and the total cost of all the movies at the store combined.

 * Libraries: java.util (Scanner, ArrayList, List, HashMap, Map)
 * Files: Main.java
*/

// Package the File so it's Available to Projects.java
package projects;

// Import Necessary Libraries
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class UnitOneTwoProject {

    public static int toI(Object obj) {
        return Integer.parseInt(obj.toString());
    }

    public static Object get(String key, Map<String, Object> dict) {
        return dict.get(key);
    }
    public static void main(String[] args) {
        // Initialize the Scanner Object
        Scanner in = new Scanner(System.in);

        // Print out the Introduction
        System.out.println("\nWelcome to PiggyCount! You will be asked a series of questions\nto help us get some imformation about how your portfolio is going! Nothing\nwill be saved anywhere.\n");
        
        // Create a HashMap for the User's Information
        Map<String, Object> userInfo = new HashMap<>();
        
        // Collect all the Information Required from the User
        System.out.print("Please enter your full name: ");
        userInfo.put("name", in.nextLine());

        System.out.print("How many quarters do you have?: ");
        userInfo.put("quarters", in.nextInt());

        System.out.print("How many dimes do you have?: ");
        userInfo.put("dimes", in.nextInt());

        System.out.print("How many nickels do you have?: ");
        userInfo.put("nickels", in.nextInt());

        System.out.print("How many pennies do you have?: ");
        userInfo.put("pennies", in.nextInt());

        System.out.print("For how long how long have you been saving (in weeks, round to an integer)?: ");
        userInfo.put("weeks", in.nextInt());
        // END USER INFO COLLECTION

        System.out.println("");

        // Print Out what the User Entered in a Formatted Table
        String leftAlignFormat = "| %-16s | %-9d | $%-6.2f |%n";

        System.out.format("+------------------+-----------+---------+%n", "");
        System.out.format("| Coin Name        | Amount    | $ Worth |%n", "");
        System.out.format("+------------------+-----------+---------+%n", "");
        System.out.format(leftAlignFormat, "Quarter", userInfo.get("quarters"), toI(get("quarters", userInfo)) * 0.25);
        System.out.format(leftAlignFormat, "Dimes", userInfo.get("dimes"), toI(get("dimes", userInfo)) * 0.10);
        System.out.format(leftAlignFormat, "Nickels", userInfo.get("nickels"), toI(get("nickels", userInfo)) * 0.05);
        System.out.format(leftAlignFormat, "Pennies", get("pennies", userInfo), toI(get("pennies", userInfo)) * 0.01);
        System.out.format("+------------------+-----------+---------+%n", "");
        System.out.format("%-41s%-1s%n", "| Saving for: " + get("weeks", userInfo) + " weeks!", "|");
        System.out.format("%-41s%-1s%n", "| Name: " + get("name", userInfo), "|");
        System.out.format("+------------------+-----------+---------+%n", "");
        // END REPRINT USER INFO

        System.out.println("");

        // Create a NumberFormater to Round a Decimal to Two Decimal Places (Money)
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        // Calculate the User's Total, Average Savings Per Week, and an Estimate of how Much they will Save in a Year at their Average Rate
        double total = (toI(get("quarters", userInfo)) * 0.25) + (toI(get("dimes", userInfo)) * 0.10) + (toI(get("nickels", userInfo)) * 0.05) + (toI(get("pennies", userInfo)) * 0.01);
        double average = total / toI(get("weeks", userInfo));
        double estimate = average * 52.1429;

        // Format the Calculated Values using the Intitialized Formatter
        String fTotal = formatter.format(total);
        String fAverage = formatter.format(average);
        String fEstimate = formatter.format(estimate);

        // Print out the Results in a Nice Format
        System.out.println("Results:\n+----------------------------------------+");
        System.out.format("%-41s%-1s%n", "| Total: $" + fTotal, "|");
        System.out.format("%-41s%-1s%n", "| Average Savings Per Week: $" + fAverage, "|");
        System.out.println("+----------------------------------------+\n");
        System.out.println(get("name", userInfo) + ", you will save about $" + fEstimate + " in one year at this rate!");

        System.out.println("\nThank you for using PiggyCount! Bye!\n");
    }
}
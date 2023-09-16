/*
 * Author: Nikhil Pellakuru
 * Start Date: 9/12/2023 at 3:58 PM Pacific Time
 * End Date: 9/12/2023 at 5:00 PM Pacific Time

 * Project Name: Movie Menu
 * Project Description: This project asks the user for six inputs. Three movie prices and
   how many are in stock at a store (imaginary). Then the program shows the data in a formatted
   table using printf and also shows the average price of the movies including how many are in stock
   and the total cost of all the movies at the store combined.

 * Libraries: java.util (Scanner, ArrayList, List, HashMap, Map)
 * Files: Main.java
*/

// Package the Project so it's Available to Projects.java Outside this Directory
package projects;

// Import Required Modules
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class UnitOneOneProject {
  public static void main(String[] args) {
    // Create the Scanner Object to Ask for User Input
    Scanner in = new Scanner(System.in);

    // List of Movie Title for Later Use
    String[] movieTitles = {"Lord of the Ringdings", "Dennis the Dentist Menace", "Spy Kids Aged 52"};

    // Create the HashMap for all the Movies' Details
    Map<String, List<Number>> movieDeets = new HashMap<>();

    // Create the ArrayLists for each movie
    List<Number> lordInfo = new ArrayList<>();
    List<Number> menaceInfo = new ArrayList<>();
    List<Number> kidsInfo = new ArrayList<>();

    // Add the ArrayLists into their respective HashMap key-value Pairs
    movieDeets.put("Lord of the Ringdings", lordInfo);
    movieDeets.put("Dennis the Dentist Menace", menaceInfo);
    movieDeets.put("Spy Kids Aged 52", kidsInfo);

    // Add Lord of the Ringdings Data Into the HashMap Dict
    System.out.print("How much is Lord?  ");
    movieDeets.get("Lord of the Ringdings").add(in.nextDouble());
    
    System.out.print("How many Lords does the store own?  ");
    movieDeets.get("Lord of the Ringdings").add(in.nextInt());

    // Add Dennis the Dentist Menace Data Into the HashMap Dict
    System.out.print("How much is Menace?  ");
    movieDeets.get("Dennis the Dentist Menace").add(in.nextDouble());

    System.out.print("How many Menace does the store own?  ");
    movieDeets.get("Dennis the Dentist Menace").add(in.nextInt());

    // Add the Spy Kids Aged 52 Data Into the HashMap Dict 
    System.out.print("How much is Kids?  ");
    movieDeets.get("Spy Kids Aged 52").add(in.nextDouble());

    System.out.print("How many Kids does the store own?  ");
    movieDeets.get("Spy Kids Aged 52").add(in.nextInt());

    System.out.println("\n");

    String leftAlignFormat = "%15s| %-28s | %-9.2f | %-10d |%n";

    System.out.format("%15s+------------------------------+-----------+------------+%n", "");
    System.out.format("%15s| Video Title                  | Cost      | # in Stock |%n", "");
    System.out.format("%15s+------------------------------+-----------+------------+%n", "");

    for (int i = 0; i <= 2; i++) {
      System.out.format(leftAlignFormat, "", movieTitles[i], movieDeets.get(movieTitles[i]).get(0), movieDeets.get(movieTitles[i]).get(1));
    }

    System.out.format("%15s+------------------------------+-----------+------------+%n", "");

    // Collect the Data from the HashTable to Calculate Total Cost and Average
    List<Number> ringDings = movieDeets.get(movieTitles[0]);
    List<Number> dennisMenace = movieDeets.get(movieTitles[1]);
    List<Number> kids = movieDeets.get(movieTitles[2]);

    // Calculate the Average and Total Cost
    double totalCost = (ringDings.get(0).doubleValue() * ringDings.get(1).intValue()) + 
                      (dennisMenace.get(0).doubleValue() * dennisMenace.get(1).intValue()) +
                      (kids.get(0).doubleValue() * kids.get(1).intValue());
    double average = totalCost / (ringDings.get(1).intValue() + dennisMenace.get(1).intValue() + kids.get(1).intValue());

    // Print the Formatted Total Cost and Average using System.out.printf();
    System.out.printf("%n%14s The total value of all tapes is: $%.2f %n", "", totalCost);
    System.out.printf("%14s The average value is: $%.2f %n", "", average);
  }
}
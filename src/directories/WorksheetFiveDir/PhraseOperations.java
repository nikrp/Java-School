package directories.WorksheetFiveDir;

import java.util.Scanner;

public class PhraseOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");

        String userPhrase = in.nextLine();
        int userPhraseLength = userPhrase.length();
        char fourthChar = userPhrase.charAt(3);

        System.out.println("");
        System.out.println(userPhrase);
        System.out.println("Length of the Phrase is: " + userPhraseLength);
        System.out.println("Fourth Character of Phrase is: " + fourthChar);
    }
}

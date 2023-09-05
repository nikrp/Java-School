package directories.WorksheetFiveDir;

public class BusinessNameToNormal {
    public static void main(String[] args) {
        String businessString = "Jones, Bob";
        int spaceIndex = businessString.indexOf(" ");
        String outputString = businessString.substring(spaceIndex) + " " + businessString.substring(0, spaceIndex - 1);
        System.out.println(outputString);
    }
}

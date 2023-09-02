package directories.WorksheetOneDir;

public class NameChart {
    public static void main(String[] args) {
        String[] names = {"NAME", "John", "Paul", "George", "Ringo"};
        String[] grades = {"GRADE", "82", "91", "98", "79"};

        for (int i = 0; i < names.length; i++) {
        System.out.println(names[i] + " \t" + grades[i]);
        }
    }
}

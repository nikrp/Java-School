package directories.WorksheetOneDir;

public class AsteriskPattern {
    public static void main(String[] args) {
        System.out.print("\n\n\n");
      
        for (int i = 0; i <= 4; i++) {
            System.out.println(" ".repeat(14) + "*\n");
        }
      
        System.out.print(" ".repeat(6));
        System.out.println(" *".repeat(8));
    }
}

package directories.WorksheetThreeDir;

public class JavaCompWinners {
    public static void main(String[] args) {
        int[] studentNum = {76, 32, 18, 47, 11, 29};

        System.out.println("\t\tJava Competition Winners\n");

        System.out.print("Place:\t\t");
        for (int place = 1; place < studentNum.length + 1; place++) {
            System.out.print(Integer.toString(place) + "\t");
        }

        System.out.println("");

        System.out.print("Student #:\t");
        for (int i = 0; i < studentNum.length; i++) {
            System.out.print(Integer.toString(studentNum[i]) + "\t");
        }

        System.out.println("\n");
    }
}

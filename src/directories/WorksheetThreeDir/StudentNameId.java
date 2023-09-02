package directories.WorksheetThreeDir;

public class StudentNameId {
    public static void main(String[] args) {
        String[] names = {"Ang", "Boyd", "Clough", "Huyen", "Manta", "Ryker", "Smith"};
        int[] ids = {1297, 3355, 9321, 2301, 9742, 1002, 1963};

        System.out.println("");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " \t" + Integer.toString(ids[i]));
        }
        System.out.println("");
    }
}

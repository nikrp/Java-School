package directories.WorksheetTwoDir;

public class FidgetCompany {
    public static void main(String[] args) {
        String companyName = "FidgetCompany";
        String companyEmail = "fidgetcompany@gmail.com";
        System.out.println("*".repeat(companyEmail.length() + 4));
        System.out.println("* " + companyName + "           *");
        System.out.println("* " + companyEmail + " *");
        System.out.println("*".repeat(companyEmail.length() + 4));
    }
}

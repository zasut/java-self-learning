import java.util.Scanner;


public class FullNameGenerator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Full Name Generator");

        System.out.println("Please type your first name: ");
        String fName = scanner.nextLine().trim();
        System.out.println("Please type your middle name: ");
        String mName = scanner.nextLine().trim();
        System.out.println("Please type your last name: ");
        String lName = scanner.nextLine().trim();
        System.out.println("Please enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        System.out.print("\nFull name: " + fName + " ");

        if (!mName.isEmpty()) {
            System.out.print(mName + " ");
        }

        System.out.print(lName);

        if (!suffix.isEmpty()) {
            System.out.print(", " + suffix);
        }

        scanner.close();
}}
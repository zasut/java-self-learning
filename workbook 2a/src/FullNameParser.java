
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Full Name Parser ---");

        System.out.println("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();

        String[] nameArrange = fullName.split(" ");


        String firstName = nameArrange[0];

        String middleName = "";
        if (nameArrange.length == 3) {
            middleName = nameArrange[nameArrange.length - 2];
        } else if (nameArrange.length > 3) {
            throw new IllegalArgumentException("Too many Characters (only accepts 3)");
        }

        String lastName = nameArrange[nameArrange.length - 1];

        System.out.println("First name: " + firstName + "\nMiddle name: " + middleName + "\nLast name: " + lastName);
        scanner.close();

    }
}

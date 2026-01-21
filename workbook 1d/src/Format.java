void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your first name: ");
    String first = scanner.nextLine();

    System.out.println("Please enter your last name: ");
    String last = scanner.nextLine();

    System.out.println("Hello " + formatName(first, last));
}

public static String formatName (String firstName, String lastName) {
    return (lastName + ", " + firstName);
}
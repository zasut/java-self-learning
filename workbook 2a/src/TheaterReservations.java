
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;
        System.out.println("--- Theater Reservations ---");


        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("What date will you be coming (MM/DD/YYYY)");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like?");
        Integer tickets = scanner.nextInt();

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate MovieDate = LocalDate.parse(date, formatter);

        if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " + MovieDate + " under " + name);
        } else {
            System.out.println(tickets + " tickets reserved for " + MovieDate + " under " + name);
        }

        scanner.close();
    }
}

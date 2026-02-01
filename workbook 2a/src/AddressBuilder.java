
import java.util.Scanner;
import java.lang.StringBuilder;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Address Builder ---");

        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        String user_name = scanner.nextLine();

        StringBuilder BillingInfo = new StringBuilder();
        System.out.print("Billing Street: ");
        BillingInfo.append(scanner.nextLine());
        System.out.print("Billing City: ");
        BillingInfo.append("\n").append(scanner.nextLine().trim());
        System.out.print("Billing State: ");
        BillingInfo.append(", ").append(scanner.nextLine().trim());
        System.out.print("Billing Zip: ");
        BillingInfo.append(" ").append(scanner.nextLine().trim());

        StringBuilder ShippingInfo = new StringBuilder();
        System.out.print("\nShipping Street: ");
        ShippingInfo.append(scanner.nextLine());
        System.out.print("Shipping City: ");
        ShippingInfo.append("\n").append(scanner.nextLine().trim());
        System.out.print("Shipping State: ");
        ShippingInfo.append(", ").append(scanner.nextLine().trim());
        System.out.print("Shipping Zip: ");
        ShippingInfo.append(" ").append(scanner.nextLine().trim());

        System.out.println("\n" + user_name);
        System.out.println("\nBilling Address:\n" + BillingInfo);
        System.out.println("\nShipping Address:\n" + ShippingInfo);

        scanner.close();
    }
}


import java.util.Scanner;
import java.lang.StringBuilder;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Address Builder ---");

        System.out.println("Please provide the following information: ");
        System.out.println("Full name:");
        String user_name = scanner.nextLine();

        StringBuilder BillingInfo = new StringBuilder();
        System.out.println("Billing Street:");
        BillingInfo.append(scanner.nextLine());
        System.out.println("Billing City:");
        BillingInfo.append("\n").append(scanner.nextLine());
        System.out.println("Billing State:");
        BillingInfo.append("\n").append(scanner.nextLine());
        System.out.println("Billing Zip:");
        BillingInfo.append("\n").append(scanner.nextLine());

        StringBuilder ShippingInfo = new StringBuilder();
        System.out.println("Shipping Street:");
        ShippingInfo.append(scanner.nextLine());
        System.out.println("Shipping City:");
        ShippingInfo.append("\n").append(scanner.nextLine());
        System.out.println("Shipping State:");
        ShippingInfo.append("\n").append(scanner.nextLine());
        System.out.println("Shipping Zip:");
        ShippingInfo.append("\n").append(scanner.nextLine());

        System.out.println(user_name);
        System.out.println("Billing Address:\n" + BillingInfo);
        System.out.println("Shipping Address:\n" + ShippingInfo);

        scanner.close();
    }
}

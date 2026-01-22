import static java.lang.Math.round;

void main() {
    Scanner scanner = new Scanner(System.in);

    double total = 29.99;
    System.out.println("Please enter the pick up date");
    String PickupDate = scanner.next();

    System.out.println("Please enter the amount of days you want to rent this vehicle");
    int length = scanner.nextInt();

    total *= length;

    System.out.println("Do you want an electronic toll tag at $3.95 a day? [yes/no]");
    String etag = scanner.next();

    if (etag.equals("yes")) {
        total += 3.95 * length;
    }

    System.out.println("Do you want roadside assistance at $3.95/day [yes/no]");
    String assistance = scanner.next();

    if (assistance.equals("yes")) {
        total += 3.95 * length;
    }

    System.out.println("Please input your current age: ");
    int age = scanner.nextInt();

    if (age < 25) {
        total *= 0.70;
    }

    System.out.println("Your pickup date is: " + PickupDate + ". The price for your rental is: $" + round(total * 100.0) / 100.00);
}
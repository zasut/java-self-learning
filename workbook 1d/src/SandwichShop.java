import static java.lang.Math.round;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--- Sandwich shop ---");

    double tax = 0.905;
    double subtotal = 0;
    System.out.println("Choose your sandwich size \n [1]: Half: base price 5.45 \n [2]: Full: base price $8.95");
    int size = scanner.nextInt();

    if (size == 1) {
        subtotal += 5.45;
    } else if (size == 2) {
        subtotal += 8.95;
    }


    System.out.println("Would you like the sandwich loaded? (Y/N) \n Regular $1.00 extra \n Large $1.75 extra");
    String loaded = scanner.next();

    if (loaded == "Y" && size == 1) {
        subtotal += 1.00;
    } else if (loaded == "N" && size == 2) {
        subtotal += 1.75;
    }

    System.out.println("Please input your age \n Student (17 years old or younger) - receive a 10% discount \n Seniors (65 years old or older) - receive a 20% discount");
    int age = scanner.nextInt();

    double discount = 1;
    if (age <= 17) {
        discount = 0.90;
    } else if (age >= 65) {
        discount = 0.80;
    }

    System.out.println("Your subtotal is: $" + round(((subtotal * discount) / tax) * 100.0) / 100.0);

}
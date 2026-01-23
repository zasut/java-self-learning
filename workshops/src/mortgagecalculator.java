import static java.lang.Math.*;
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please insert your loan:");
    double loan = scanner.nextDouble();

    System.out.println("Please enter your interest rate:");
    double interest = scanner.nextDouble();

    System.out.println("Please enter your loan length:");
    int length = scanner.nextInt();

    double monthly_payment = ((loan * ((interest / 100) / 12) * Math.pow(1 + ((interest / 100) / 12), length * 12)) / (Math.pow(1 + ((interest / 100) / 12), length * 12) - 1));

    System.out.println("Your monthly payment is: $" + round(monthly_payment) + "\n with a total interest of $" + ((monthly_payment * (12 * length)) - loan));

}


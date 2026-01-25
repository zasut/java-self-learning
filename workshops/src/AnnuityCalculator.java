void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- Annuity Present Value Calculator ---");

    System.out.println("Enter monthly payout");
    double monthlyPayout = scanner.nextDouble();
    System.out.println("Enter the expected annual interest rate (in decimal form. example: 5% is 0.05)");
    double annualInterestRate = scanner.nextDouble();
    System.out.println("Enter the number of years to pay out");
    int years = scanner.nextInt();
    scanner.nextLine();

    double presentValue = monthlyPayout * ( (1 - Math.pow(1 + annualInterestRate / 12, -12 * years)) / (annualInterestRate / 12));

    System.out.printf("\nTo fund an annuity that pays $%.2f monthly for " + years + " years" + " and earns an expected %.2f", monthlyPayout, annualInterestRate * 100);
    System.out.println("% interest,");
    System.out.printf("you would need to invest $%.2f today. \n", presentValue);
}
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("--- CD calculator ---");

    System.out.println("Enter initial deposit:");
    double principal = scanner.nextDouble();
    System.out.println("Enter annual interest rate (in decimal form. example: 5% is 0.05)");
    double annualInterestRate = scanner.nextDouble();
    System.out.println("Enter number of years that CD will mature:");
    int numYears = scanner.nextInt();
    scanner.nextLine();

    double futureValue = principal * Math.pow(1 + (annualInterestRate / 365), 365 * numYears);
    double totalInterest = futureValue - principal;

    System.out.printf("\nIf you deposit $%.2f in a CD that earns %.4f", principal, annualInterestRate * 100);
    System.out.println("% annual interest and matures in " + numYears + " years,");
    System.out.printf("your CD's ending balance will be $%.2f, and you would have earned $%.2f in interest.\n", futureValue, totalInterest);
}
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- Payroll Calculator ---");

    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Please enter your hours worked this week: ");
    float hours = scanner.nextFloat();

    System.out.print("Please enter your pay rate: ");
    float pay = scanner.nextFloat();

    float overtime_pay = 0f;

    if (hours > 40) {
        System.out.println("You have worked overtime which is a premium rate of 1.5x pay");
        overtime_pay = (hours - 40) * (pay * 1.5f);
    }

    System.out.println(name + ", You worked " + hours + " This week. Your gross pay is: $" + ((hours * pay) + overtime_pay));



}
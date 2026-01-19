
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter your second number: ");
    int num2 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Possible calculations: \n A - add \n S - subtract \n M - multiply \n D - divide");
    String action = scanner.nextLine();
    switch(action) {
        case "A":
            System.out.println(num1 + num2);
            break;
        case "S":
            System.out.println(num1 - num2);
            break;
        case "M":
            System.out.println(num1 * num2);
            break;
        case "D":
            System.out.println(num1 / num2);
            break;
        default:
            System.out.println("Invalid operator");
            break;
    }





}
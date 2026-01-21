void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please input your number: ");
    int number = scanner.nextInt();

    System.out.println("Please input your second number: ");
    int number2 = scanner.nextInt();

    if (number > number2) {
        System.out.println(number + " is bigger than " + number2);
    } else if (number2 > number) {
        System.out.println(number2 + " is bigger than " + number2);
    }

    System.out.println("Would you like to know whether your original number is even? [Y/N]");
    String uinput = scanner.next();

    if (uinput.equals("Y")) {
        System.out.println(IsEven(number));
    }
}

public static String IsEven(int number1) {
    if (number1 % 2 == 0) {
       return (number1 + " is even.");
    }
    else {
        return (number1 + " is not even.");
    }

}
package com.cellphone;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Cell Phone Service ***");

        CellPhone phone1 = new CellPhone();

        //get inputs & call setters for phone1
        System.out.print("What is the serial number?: ");
        phone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); //consume leftover \n

        System.out.print("What model is the phone?: ");
        phone1.setModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier?: ");
        phone1.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number? (###-###-####): ");
        phone1.setPhoneNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner of the phone?: ");
        phone1.setOwner(scanner.nextLine().trim());

        //create arbitrary phone2
        CellPhone phone2 = new CellPhone(10000, "Android", "Verizon", "123-456-7890", "Bob");

        //print results
        display(phone1);
        display(phone2);

        //call phone2
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        scanner.close();
    }

    public static void display(CellPhone phone) {
        System.out.printf("""
                \n--- Phone ---
                Serial Number: %d
                Model: %s
                Carrier: %s
                Phone Number: %s
                Owner: %s
                """, phone.getSerialNumber(), phone.getModel(), phone.getCarrier(),
                phone.getPhoneNumber(), phone.getOwner());
    }
}

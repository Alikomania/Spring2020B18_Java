package day13_StringClass;
/*
3. write a program for the shipping info that,
the program should ask:
       building number
       Street address (Assume it has more than one word)
       city name
       state name
       zip code
       full name of the person:
       and prints the ship to info in the following format:

         ex output:

            Ship To:  Jimmy joe
            7925 Jones Branch Dr
           MCLean, VA 22102
 */

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum = input.next(); // 7925 + Enter

        input.nextLine(); // Because AFTER NEXT METHOD
        System.out.println("Enter your street address");
        String street = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zipcode = input.next(); // 22102 + Enter

        input.nextLine(); // Because AFTER NEXT METHOD
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String result = "Ship To: "+fullName+
                "\n\t\t"+buildingNum+" "+street+
                "\n\t\t"+city+", "+state+" "+zipcode;
        System.out.println(result);


    }
}

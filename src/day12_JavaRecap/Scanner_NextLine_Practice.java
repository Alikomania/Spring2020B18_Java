package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 1) 7925Enter // 2) Enter // 3)

// 7925 JonesBranch Dr, McLean VA, 22034
// fullAddress: Building number, street, city, state, zip code

        System.out.println("Enter Building number");
        int Bnumber = input.nextInt(); // 1) 7925

        System.out.println("Building number: "+Bnumber);

        input.nextLine(); // 3) used for taking out the Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine(); // 2) Enter
        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code");
        int zipCode = input.nextInt();

        input.nextLine(); // take out the Enter

        System.out.println("Enter the city name and state seperated by coma and space");
        String cityState = input.nextLine();

        String fulladdress = Bnumber+" "+street+", \n"+cityState+" "+zipCode;

        System.out.println(fulladdress);

        input.close(); // closes the scanner. its not mandatory but its recommended





    }
}

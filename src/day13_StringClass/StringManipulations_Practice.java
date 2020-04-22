package day13_StringClass;

import java.util.Scanner;

/*
input: cyBerTek sChool

output:
    Cybertek
    School
 */
public class StringManipulations_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine(); // cybertek school

        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring( fullName.indexOf(" ")+1 );

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
// explain af. cl.==> Selected first name's 1 letter and.convert to upper case + all letters of first name -after 1st letter- convert to lower case.

            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is: "+firstName);
        System.out.println("Your last name is: "+lastName);

        /*
        Assignment:

        Write me a program that asks the user
        first and last names, then prints the initials.

        ex:
            input:
                cybertek
                school

            output: CS

         */

        System.out.println("Enter your first name");
        String first = input.next();
        System.out.println("Enter your last name");
        String last = input.next();

        String initial = first.substring(0, 1).toUpperCase() + last.substring(0, 1).toUpperCase();
        System.out.println(initial);

    }
}

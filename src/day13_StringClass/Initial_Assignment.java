package day13_StringClass;

import java.util.Scanner;

public class Initial_Assignment {
    public static void main(String[] args) {

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

                Scanner s = new Scanner(System.in);
                System.out.println("Enter your first name");
                String firstName = s.next();
                System.out.println("Enter your last name");
                String lastName = s.next();

                String initial = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase();

                System.out.println(initial);



    }
  }

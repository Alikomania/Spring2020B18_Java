package day15_ForLoop;

import java.util.Scanner;
/*
1. write a program that asks user's first
and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
 */
public class Initial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = s.next();
        System.out.println("Enter your last name");
        String lastName = s.next();

/*
        initial1 = firstName.substring(0, 1);
        initial2 = lastName.substring(0, 1);
        initial1 = firstName.toUpperCase();
        initial2 = lastName.toUpperCase();
        System.out.println(initial1+initial2);
*/
  /*
        System.out.println(firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase() );
*/
  String initials = "" + firstName.charAt(0) + lastName.charAt(0); // returns String
        initials = initials.toUpperCase();
        System.out.println(initials);




    }
}

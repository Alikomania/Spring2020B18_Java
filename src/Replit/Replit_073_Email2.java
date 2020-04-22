package Replit;
import java.util.Scanner;
/*
Instructions from your teacher:
Write a program that will print out information
about the user based on email. Print first and last name
from the email with the upper case.
(Assume that first and last names were
separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class Replit_073_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.next();

        String str = "";
        int first = email.indexOf("_");
        int last = email.indexOf("@");
        int dot = email.lastIndexOf(".");
        String firstName = email.substring(0, first);
        String lastName = email.substring(first+1, last);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length() ).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();
        String domain = email.substring(last+1, dot );
        String topLevelDomain = email.substring(dot+1);

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+topLevelDomain);


    }
}

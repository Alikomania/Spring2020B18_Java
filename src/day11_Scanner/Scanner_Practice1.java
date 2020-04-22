package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
 /*
 task:

	1. ask the user enter first name
	2. ask uster to enter last name
	3. ask the user employeed or not?
	true ==> emloyeed, false ==> unemployeed
	4. if he is employeed ask the salary
	5. if he is not employeed set the salary to 0

	output:
		full name:
		employeed status:
		salary:
  */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = s.next();
        System.out.println("Enter your last name");
        String lastName = s.next();

        String fullName = firstName+" "+lastName;

        System.out.println("Are you employeed?");
        boolean employeementStatus = s.nextBoolean();

        double salary = 0;

        if(employeementStatus == true){
            System.out.println("Enter your salary");
            salary = s.nextInt();

        }

        System.out.println("Full name is: "+fullName);
        System.out.println("Your employment status is :"+employeementStatus);
        System.out.println("Your salary is: "+salary);


    }
}

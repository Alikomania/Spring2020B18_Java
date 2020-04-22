package day10_Switch_Scanner;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;
/*
 write a program for the rate calculater
	1. asks the user to enter salary (as integer)
	2. asks the user how many hours does she/he works in a weeks
	3. print the hourly rate

	alternate solution:
	Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("Enter your hours works in a week");
        byte hours = input.nextByte();

        byte weeksInYear = 52;

        System.out.println("Your rate is: "+ (salary / (hours*weeksInYear)));
	*/
public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("How many hours do you work in per week?");
        byte weeklyHours = input.nextByte();
        System.out.println("How many weeks do you work in a year?");
        byte numberOfWeeks = input.nextByte();

        // hourlyRate = ( salary / numberOfWeeks) / WeeklyHours

        int hourlyRate = (salary / numberOfWeeks) / weeklyHours;

        System.out.println("Your rate is: $"+hourlyRate);


    }
}

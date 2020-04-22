package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter company name");
        String companyName = scan.nextLine();

        System.out.println("Enter ssn");
        int ssnNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter Job Title");
        String jobTitle = scan.nextLine();

        System.out.println("Your full name: "+fullName+
                "\nYour Job Title: "+jobTitle+
                "\nYour Company Name: "+companyName+
                "\nYour SSN: "+ssnNumber+
                "\nYour salary: "+salary);
    }
}

package day11_Scanner;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
       2. write a program that can calculate the salary after tax
				need information:
							employee' salary
							state tax
							federal tax

							MUST use Scanner
        stateTaxRate = 0.04;
        federalTaxRate = 0.22;

        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        System.out.println("Enter the state tax rate");
        double stateTax = scan.nextDouble();
        double stateTaxRate = stateTax / 100;

        System.out.println("Enter the federal tax rate");
        double federalTax = scan.nextDouble();
        double federalTaxRate = federalTax / 100;

        double totalTax = (stateTaxRate + federalTaxRate) * salary;

        double salaryAfterTax = salary - totalTax;
        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax: $"+totalTax);


    }

}

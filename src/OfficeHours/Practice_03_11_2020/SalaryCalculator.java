package OfficeHours.Practice_03_11_2020;

public class SalaryCalculator {

/*
    if:
    rate = 55;
    stateTaxRate = 0.04;
    federalTaxRate = 0.22;
    weeklyHours = 40;
    then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
                if:
    rate = 45.25;
    stateTax =0.045;
    federalTax = 0.25;
    weeklyHours = 45;

            then output will be:
            your salary is: 91260 USD
            your total tax is: 26921.7
            your income after tax: 64338.3 USD
*/

    public static void main(String[] args) {


        double rate = 45.25;
        double stateTaxRate = 0.045;
        double federalTaxRate = 0.25;
        byte weeklyHours = 45;
        byte totalWeeks = 48;
        double GrossSalary = rate * weeklyHours * totalWeeks;
        double stateTax = GrossSalary * stateTaxRate;
        double federalTax = GrossSalary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double incomeSalary = GrossSalary - totalTax;

        System.out.println("Your salary is: "+GrossSalary+" USD");
        System.out.println("Your total tax is: "+totalTax+" USD");
        System.out.println("Your income after tax: "+incomeSalary+" USD");



    }


}

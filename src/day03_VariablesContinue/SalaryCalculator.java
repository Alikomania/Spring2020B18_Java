package day03_VariablesContinue;

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

        double HourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;

        double salary = HourlyRate*weeklyHours*totalWeeks;

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;
        double totalTax = federalTax + stateTax;

        String YourSalary = "Your salary is: $";

        // salaryAfterTax = salary - stateTax - federalTax

        double salaryAfterTax = salary - (stateTax + federalTax);


        System.out.println(YourSalary+salary);
        System.out.println("State tax is: $"+stateTax);
        System.out.println("Federal tax is: $"+federalTax);
        System.out.println("Total Tax is: $"+ totalTax );
        System.out.println("Salary After Tax is: $"+ salaryAfterTax);
        System.out.println(YourSalary+salaryAfterTax);

    }
}

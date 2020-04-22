package day02_Variables;

public class EmployeeInfo_Variables {

    /*

     print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary
                ssn
     */

    public static void main(String[] args) {

        String employeeName = "Fatih";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "SDET";
        double salary = 120000.5;
        int ssn = 304533525;

        /*

        System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("Social Security Number: "+ssn);
     */

        System.out.println("Emloyee Name: "+employeeName + "\nCompany Name: " +
                companyName + "\nEmployee Id: " + employeeId + "\nJob Title: " +
                jobTitle + "\nSalary: " + salary + "\nSocial Security Number: " + ssn);

        System.out.println("===============");

        String firstName = "Hunar";
        String lastName = "Muhammad";

        System.out.println("Full Name: "+firstName + " "+lastName);

        System.out.println(11 + 10); // 21
        System.out.println("11" + "10"); // 1110


    }


}

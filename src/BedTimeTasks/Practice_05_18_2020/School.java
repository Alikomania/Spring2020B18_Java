package BedTimeTasks.Practice_05_18_2020;
import java.util.Arrays;
import java.util.ArrayList;
/*
create a class called company:
    create 3 objects of employee and set their info
    create an array of employees and store all those employee objects
    use regular for loop to print out each employee' name and employeeID

 */
public class School { // School Has A student

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmployeeInfo("Ali", 39, 'M', 100000, 1234, "SDET");

        Employee emp2 = new Employee();
        emp2.setEmployeeInfo("Ahmet", 35, 'M', 110000, 5678, "Senior SDET");

        Employee emp3 = new Employee();
        emp3.setEmployeeInfo("Elif", 29, 'F', 120000, 4325, "Developer");

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));

    //    Employee[] arr = {emp1, emp2, emp3};

        for (Employee each : employeeList){
            System.out.println(each.name+", "+each.employeeID);
        }





    }


}

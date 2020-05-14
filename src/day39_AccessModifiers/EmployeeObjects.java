package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ali", "SDET", 1234, 120000);
        Employee employee2 = new Employee("Omer", "SDET Lead", 5678, 140000);
        Employee employee3 = new Employee("Osman", "Developer", 32452, 150000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }

}

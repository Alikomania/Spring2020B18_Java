package day41_Inheritance.Test01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer(120000, "Namik", 123, "Software Developer", 'M');

        // dev1.reporting();
        dev1.fixingBug();

        System.out.println( dev1 );

        Tester tester1 = new Tester("Ali", 100000, 3456, "SDET", 'M');
        tester1.reporting();
        System.out.println(tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst("Muhtar", 150000, 4567, 'M');
        BA1.gathering();
        System.out.println(BA1);





    }


}

package day40_Encapsulation;

public class Person_Object {

    public static void main(String[] args) {

        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
    //  System.out.println( Zarina.SSN );

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN: "+ Zarina.getSSN());

        Zarina.setID(45678);
        System.out.println("Zarina's ID: "+Zarina.getID());

    }


}

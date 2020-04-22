package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = -2;

        if(number >= 0){
            System.out.println(number+ " is positive");
        }
        if(number < 0){
            System.out.println(number+ " is negative");
        }

        // Here is the easy way :
         //     |
         //     v

        if(number >= 0){
            System.out.println(number+ " is positive");
        } else {
            System.out.println(number+ " is negative");
        }
        System.out.println("===================================");

        int num1 = 101;

        if(num1 % 2 == 0){
            System.out.println(num1+" is even number");
        }
        if(num1 % 2 != 0){
            System.out.println(num1+" is odd number");
        }

    // easy way :

        if(num1 % 2 == 0){
            System.out.println(num1+" is even number");
        } else { // otherwise
            System.out.println(num1 + " is odd number");
        }

        int age = 30;

        if(age >= 21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go drink your milk");
        }

        boolean testedPositiveForCorona = !true;

        if(testedPositiveForCorona){
            System.out.println("Buy more toilet papers");
        } else {
            System.out.println("Do more coding");
        }


    }
}

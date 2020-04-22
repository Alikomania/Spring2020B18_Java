package day07_IfStatements;

public class WarmUp1_ValidTriangle {
    public static void main(String[] args) {
        /*
        1. A triangle is valid if the sum of all the three angles
        is equal to 180 degrees. Write a program that declares
        three integers as angles and check whether
        a triangle is valid or not.
         */

        double a = 30;
        double b = 60;
        double c = 80;
        double triangleDegrees = a + b + c;

        boolean result = triangleDegrees == 180;

        if(result){
            System.out.println("It is triangle");
        }
        if(!result){
            System.out.println("It is not triangle");
        }

    }
}

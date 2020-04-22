package OfficeHours.Practice_03_11_2020;

public class Sequare {

    /*

    task 07:
        create a class called Sequare,
        and write a program that can calculate
        the areas and perimeters of the sequare
        based on the length of the sequare,
        and print the result
        Note: you only need to length
        of the sequare in order to calculate
        the area and perimeter

     */

    public static void main(String[] args) {

        byte length = 5;
        int areas = length * length;
        int sequare1 = 4;
        int perimeters = length * sequare1;

        System.out.println("Areas: "+areas+"\nPerimeters: "+perimeters);
    }
}

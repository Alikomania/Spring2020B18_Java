package OfficeHours.Practice_03_11_2020;

public class Circle {

    /*

    task 06:
        create a class called Circle,
        and write a program that can calculate the areas
        and perimeters of the circle
        based on the value of the radius,
        and print the result
        Note: assume that pi is equal to 3.14,
        and you only need to radius in order to
        calculate the area and perimeter,
        and print the result
     */
    public static void main(String[] args) {

        int radius = 4;
        double pi = 3.14;
        double areas = 2*pi*radius;
        double perimeter = radius*(radius*pi);

                System.out.println("Areas: "+areas);
        System.out.println("Perimeter: "+perimeter);

    }
}

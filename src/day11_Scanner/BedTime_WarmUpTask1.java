package day11_Scanner;

import java.util.Scanner;

public class BedTime_WarmUpTask1 {
    public static void main(String[] args) {
 /*
 scanner warmup tasks:
1. write a program that can calculate the area of circle
			needed information:
				1. radius of the cirle
  */

        Scanner c = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius = c.nextDouble();
        double areaOfCircle = radius * radius * 3.14;
        System.out.println(areaOfCircle);

    }
}

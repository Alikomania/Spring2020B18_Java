package day18_nestedLoops;
import java.util.Scanner;
/*
1. write a program that can divide two numbers.
	(Assume that first number is grater than the second)
		NOTE: DO NOT USE division, multiplication, or module operators

		10 / 3 => 3 with a remainder of 1
		10 -3 -3 -3 = 1
		a = a - b = 7;
		a = a - b = 4;
		a = a - b = 1;
	count = 3; a = 1;
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int count = 0; // count the execution of the loop

        if(b == 0){
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }

        while (a >= b){
            a -= b;
            count++;
        }
        if(a == 0){
            System.out.println("The result is: "+count);
        } else {
            System.out.println("The result is: "+count+" with a remainder of "+a);
        }


    }
}

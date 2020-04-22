package day17_WhileLoops;

import java.util.Scanner;
/*
1. write a program that can ask the user "enter a number"
 five times and return the maximum number
	hint: you will nedd for loop and if statement

2. write a program that can ask the user "enter a number"
 five times and return the minimum number
		hint: you will nedd for loop and if statement
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = -2147483648; // any number the user provided will be greater than this number
        // first user entered variable will be initalized to maxNumber

        int minNumber = 2147483647;

        for(int i = 1; i < 6; i++){
            System.out.println("Enter a number");
            int num = input.nextInt(); // 0, 1, 2, 3, 4,

            if(num > maxNumber){ // to compare each user inputs, and assign the maximum number to maxNumber
                maxNumber = num;
            }
            if(num < minNumber){
                minNumber = num;
            }
        }
        System.out.println("Maximum number: "+maxNumber);
        System.out.println("Minimum number: "+minNumber);





    }
}

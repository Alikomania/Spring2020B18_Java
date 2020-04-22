package day18_nestedLoops;

import java.util.Scanner;

/*
warmup tasks:
	1. write a program that can divide two numbers.
	(Assume that first number is grater than the second)
		NOTE: DO NOT USE division, multiplication, or module operators
	2. write a program that can return the factorial number of
	any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int result = 1;

        while (num >= 1){
           result *= num; // result = result * num
            num--;
        }
        System.out.println(result);


 /*
  int sum = 1;

        for(int i = 1; i <= num; i++){

        sum *= i;

        }
        System.out.println(sum);
  */










    }
}

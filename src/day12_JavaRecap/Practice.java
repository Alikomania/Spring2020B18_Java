package day12_JavaRecap;


import java.util.Scanner;

public class Practice {


            public static void main(String[] args) {
 /*(Palindrome number)
 Write a program that prompts the user to enter
 a three-digit integer and determines whether
 it is a palindrome number. A number is palin- drome
 if it reads the same from right to left and
 from left to right. Here is a sample run of this program:
 Enter a three-digit integer: 121
121 is a palindrome
Enter a three-digit integer: 123
123 is not a palindrome
 */

                Scanner input = new Scanner(System.in);

                System.out.println("Enter 3 digit number: ");
                int num= input.nextInt();

                int num1, num3;
                num1 = num % 10;
                num3 = ((num/100));
                if((num % 99 != 0) && (num / 1000 == 0)) {
                    if (num1 == num3) {
                        System.out.println("It's palindrome");
                    } else if (num1 != num3) {
                        System.out.println("It's not palindrome");
                    }
                }else{
                    System.out.println("It's not 3 digit numner");
                }
        }
    }


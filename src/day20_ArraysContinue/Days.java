package day20_ArraysContinue;

import java.util.Scanner;

/*
Create an array that holds the days
User should be able to enter the day index and output should be:
“Today is Monday”
 */
public class Days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            // size 7, max index; 6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts = 1;

        while (num > 7 || num < 1){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter a number");
            num = input.nextInt();

            if(attempts == 3 && (num > 7 || num < 1)){
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0);
            }

        }

        String result = days[num-1];

        System.out.println(result);


    }
}

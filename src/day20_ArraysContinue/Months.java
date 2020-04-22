package day20_ArraysContinue;

import java.util.Scanner;
import java.util.Arrays;

/*
Create an array that holds 12 months names
User should be able to enter month index and output should be:
“The month name is <MonthName>”
 */
public class Months {
    public static void main(String[] args) {

        String[] month = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    //      0      1       2        3       4       5       6       7     8      9      10     11

        /*
        String[] month2 = new String[12];
                month2[0] = "Jan";

         */
/*
        Scanner input = new Scanner(System.in);




        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts = 1;

       while (num > 12 || num <= 0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();

            attempts++;
            if(attempts == 3 && (num > 12 || num <= 0) ){
                System.out.println("Invalid Entry, you already have 3 attempts");
                System.exit(0);
            }
        }

        String result = month[num-1];

        System.out.println(result);
*/

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


                //TODO: Write your code below
        String result = "";


        for(int i = 0; i < words.length; i++){
            words[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
        }
        System.out.println(words);




    }
}

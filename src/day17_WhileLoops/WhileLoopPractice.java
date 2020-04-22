package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        /*
        ask the user to enter yes or no.
            if the user enters other than yes or no, repeat the question
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");

        while (!valid){ // while the input is not yes or no, repeats the question
            System.out.println("Please re-enter");
            word = input.next();

            if(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break; // if condition is cant be 'valid',
                // because before the line (21) assign the new word.
                // not the same word line 17.
            }
        }

        if(word.equalsIgnoreCase("yes")){
            System.out.println("Entered yes");
        }

        if(word.equalsIgnoreCase("no")){
            System.out.println("Entered No");
        }



    }

}

package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
/*
Write a program that asks user to enter his/her username
and password until user enters correctly.

user: cybertek
pass: cybertek123

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.next();
        System.out.println("Enter password");
        String passWord = input.next();

    boolean valid = (userName.equalsIgnoreCase("cybertek") && passWord.equalsIgnoreCase("cybertek123") );

 // 2nd way =>  while (!valid){ if choose this way, we should add if statement before last print statement.
        // because username and password is changed second and other entered

        int count = 1; // if we want to limit the entered.
                    // should be 1, if started 0, it counts one more extra.

        // while((userName.equalsIgnoreCase("cybertek") && passWord.equalsIgnoreCase("cybertek123") )){

        while ( !valid){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter username");
            userName = input.next();

            System.out.println("Enter password");
            passWord = input.next();

   // 2nd way => if((userName.equalsIgnoreCase("cybertek") && passWord.equalsIgnoreCase("cybertek123") )){
         // or => valid = (userName.equalsIgnoreCase("cybertek") && passWord.equalsIgnoreCase("cybertek123") );
        // or => if(valid){
            //    System.out.println("Logged in");
            //    break;
            //}

            valid = (userName.equalsIgnoreCase("cybertek") && passWord.equalsIgnoreCase("cybertek123") );

            count++;
            if(count == 3 && !valid){ // already have three attempts and credentials are still incorrect.
                System.out.println("Your account is locked");
                break; // if this statement is true, exit the statement
            }; // limit 3 enter, then locked

        }

        if(valid){
            System.out.println("Logged in");

        }





    }
}

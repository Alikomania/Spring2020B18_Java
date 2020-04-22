package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
  /*
  valid credentials are:

    username: cybertek
    password: cybertekschool

precondition: username and password cannot be empty
           if they are empty => please enter the credential
    if user entered both valid username and password => log in
    if valid password, invalid username => username is incorrect
    if valid username, invalid password => password is incorrect
    if both password and username are invalid => invalid username and password

   */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name");
        String inputUserName = input.nextLine();
        System.out.println("Enter password");
        String inputPassWord = input.nextLine();

        boolean logedIn = inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered both valid username and password
        boolean invalidUserName = !inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // valid password, invalid username
        boolean invalidPassWord = inputUserName.equals("Cybertek") && !inputPassWord.equals("cybertekschool");
        // username is valid, but password is invalid

        if(!inputUserName.isEmpty() && !inputPassWord.isEmpty() ){
            if(logedIn){
                System.out.println("Logged in");
            } else if (invalidUserName){
                System.out.println("Password is correct, username is incorrect");
            } else if(invalidPassWord){
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }

        } else {
            System.out.println("Please enter the credential");
        }




    }
}

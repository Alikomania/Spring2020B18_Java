package day14_StringClass;

import java.util.Scanner;

/*
       userName: cybertek
       passWord: cybertekschool
*/
public class credentials {
    public static void main(String[] args) {
        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name");
        String inputUserName = input.next();
        System.out.println("Enter password");
        String inputPassWord = input.next();

        boolean validCredentials = inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord);

        if(validCredentials){
            System.out.println("Log in succesfully");
        } else {
            System.out.println("Invalid credentials");
        }



    }
}

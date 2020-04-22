package day11_Scanner;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
    /*
    3. write a program that can display the selected browser

	1. declare a String variable called browserName
	2. Assume that the valid browsers are:
	chrome, firefox, opera, safari.
	3. if the browser name does not match
	with the valid browsers' names, output should be:
	Invalid Browser Name
     */
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your browserName");

        int browserName = input.nextInt();
        String result = " ";
        switch (browserName){
            case 1:
                result = "Chrome";
                break;
            case 2:
                result = "Firefox";
                break;
            case 3:
                result = "Opera";
                break;
            case 4:
                result = "Safari";
                break;
            default:
                result = "Invalid Browser Name";
        }
        System.out.println(result);
/*
alternate:

        String browserName = "Chrome";
        switch (browserName) {
            case "Chrome":
            case "Firefox":
            case "Opera":
            case "Safari":
             System.out.println(browserName + " is opening...");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }
    }
 */


    }
}

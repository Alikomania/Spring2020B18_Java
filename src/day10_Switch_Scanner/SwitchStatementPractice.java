package day10_Switch_Scanner;

public class SwitchStatementPractice {
    /*
    2.Write a program to display days:
    1-Monday
    2-Tuesday
    3-Wednesday
    4-Thursday
    5-Friday
    6-Saturday
     */
    public static void main(String[] args) {

        byte num = 8;

        switch (num){
            case 1:
                System.out.println("Monday");
                break; // Case closed
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }


    }
}

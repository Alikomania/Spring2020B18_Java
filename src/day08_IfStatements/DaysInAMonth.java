package day08_IfStatements;

public class DaysInAMonth {
    /*
    WarmUpTask_2.

   Write a program that can find the number of days
	   in a month (Assume that Feb has 28 days)
     */

    public static void main(String[] args) {

    byte month = 12;

    boolean days28 = month == 2;
    boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
    boolean days31 = !days28 && !days30;

    if(days28){
        System.out.println("It has 28 days");
    }
    if(days30){
        System.out.println("It has 30 days");
    }
    if(days31){
        System.out.println("It 31 days");
    }


    }
}

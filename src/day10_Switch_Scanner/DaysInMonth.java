package day10_Switch_Scanner;

public class DaysInMonth {
    /*
    4. write a program that can find
    the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
     */
    public static void main(String[] args) {

int num = 13;

boolean days28 = num == 2;
boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;
boolean days31 = num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12;
String result = " ";

        result = (days28)? "28 days" :
                (days30)? "30 days" :
                        (days31)? "31 days" :
                                "Invalid";
        System.out.println(result);



    }
}

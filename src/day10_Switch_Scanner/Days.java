package day10_Switch_Scanner;

public class Days {
    /*
    2. write a program that can display the days
    based on the numbers 1 ~ 7
			MUST USE NESTED IF
     */
    public static void main(String[] args) {

                 byte day = 8;
                String dayToWord = " ";
            dayToWord = (day == 1)? "Monday" :
                    (day == 2)? "Tueasday" :
                            (day == 3)? "Wednesday" :
                                    (day == 4)? "Thursday" :
                                            (day == 5)? "Friday" :
                                                    (day == 6)? "Saturday" :
                                                            (day == 7)? "Sunday" :
                                                                    "Invalid";
                 System.out.println(dayToWord);



    }
}

package day11_Scanner;

import java.util.Scanner;

public class BedTime_WarmUpTask3 {
    public static void main(String[] args) {
/*
3. Write a Java Program that can calculate
the grade of a student based on the score,
	implement the following logic:
		If marks < 60, then print “Fail”
		If marks >= 60, but less than 90, then print “Pass”
		If marks >= 90, then print “Passed with Distinction”
			MUST use scanner
 */
        Scanner cal = new Scanner(System.in);
        System.out.println("Enter student score");
        byte score = cal.nextByte();
        String result = " ";
        if (score >= 0 && score <= 100) {
            if (score < 60) {
                result = "Fail";
            } else if (score >= 60 && score < 90) {
                result = "Pass";

            } else {
                result = "Passed with Distinction";
            }
        }
        System.out.println(result);
    }
}

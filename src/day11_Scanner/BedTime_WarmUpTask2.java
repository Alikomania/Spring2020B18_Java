package day11_Scanner;

import java.util.Scanner;

public class BedTime_WarmUpTask2 {
    public static void main(String[] args) {
/*
2. Ask user to enter two words.
Then add them together and print.

			Input:
				one
				eight

				Output:
				oneeight
 */
        Scanner w = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = w.next();
        System.out.println("Enter second word");
        String word2 = w.next();
        System.out.println(word1+word2);


    }
}

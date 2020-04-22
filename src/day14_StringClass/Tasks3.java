package day14_StringClass;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
/*
3. Ask user to enter a word.
Print true is the first and
last characters of the string are same characters,
print false otherwise.
			Input:
				abba
			Output:
				true
 */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = s.next();

        int length = word1.length();

        if(word1.charAt( 0 ) == word1.charAt(length - 1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

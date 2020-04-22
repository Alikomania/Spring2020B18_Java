package day14_StringClass;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
/*
4. Ask user to enter a word. Print "really?"
if the word ends with ly,
print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
 */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();

        int length = word.length();

        if(word.endsWith("ly") ){
            System.out.println("really?");
        } else {
            System.out.println("Never mind");
        }




    }
}

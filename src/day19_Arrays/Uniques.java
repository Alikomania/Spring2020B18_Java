package day19_Arrays;

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
/*
Warm up task:
	1. write a program that can return the unique characters
	from a string
		Ex:  "AABCC" ==> "B"

 */

    String str = "AABCCDDEF";
    String result = ""; // "B" to store the unique characters

        for(int j = 0; j <= str.length()-1; j++){

            int count = 0; // to count the occurance of the character

            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }

            if(count == 1){// the character at index j is unique, will be
                            // concated to the sult
                result += str.charAt(j);
            }

        }

        System.out.println(result);





    }
}

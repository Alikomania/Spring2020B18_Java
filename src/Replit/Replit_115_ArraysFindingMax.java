package Replit;
/*
Instructions from your teacher:
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Arrays;
import java.util.Scanner;
public class Replit_115_ArraysFindingMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "";
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

            while(str.length() < words[i].length()){
                str = words[i];
            }
        }

        System.out.println(str);

    }
}

package day15_ForLoop;

import java.util.Scanner;

public class AssignmentReverse {
    public static void main(String[] args) {
/*
write a program to identify if a string is palindrome or not.
if yes ==> true,
otherwise ==> false
        level ==> level ==> palindrome
 */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();

        String result = "";
        int lastIndexnum = word.length()-1;

        for(int i = lastIndexnum; i >= 0; i--){
            result += word.charAt(i);
        }
        boolean palindrome = word.equals(result);
        System.out.println(palindrome);


/*
String name="level";
int n=name.length()-1;
String s="";
for(int i=n;i>=0;i-- ){
    s+=name.charAt(i);
}
boolean b=name.equals(s);
        System.out.println(b);
 */


    }
}

package day16_ForLoop;
import java.util.Scanner;
public class Replit_62 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String first = "" + word.charAt(0);
        String last = "" + word.charAt(word.length() - 1);
        System.out.println(first + last);


    }
}


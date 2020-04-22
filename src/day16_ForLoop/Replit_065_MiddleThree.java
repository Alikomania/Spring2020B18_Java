package day16_ForLoop;
import java.util.*;
public class Replit_065_MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //YOUR CODE HERE

        int length = word.length();
        int indexNum = length-1;
        String str = "";

        boolean odd = length % 2 != 0 && length > 4;

        if(odd){
         str = ""+ word.charAt(indexNum/2-1) + word.charAt(indexNum/2) + word.charAt(indexNum/2+1);
        } else {
            str = "Invalid";
        }
        System.out.println(str);


    }
}

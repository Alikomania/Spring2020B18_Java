package day16_ForLoop;
import java.util.*;
public class Replit_064_MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //YOUR CODE HERE

        int length = word.length();
        int indexNum = length-1;

        boolean odd = length % 2 != 0 && length > 1;
        boolean single = length == 1;
        boolean even = length % 2 == 0 && length > 2;
        boolean twoCh = length == 2;

        String str = "";

        if(odd){
            str = ""+ word.charAt(indexNum/2);
        } else if(single){
            str = word.concat(word).concat(word);
        } else if(even){
            str = ""+ word.charAt(length/2-1) + word.charAt(length/2);
        } else if(twoCh){
            str = word.concat(word);
        }
        System.out.println(str);





    }

}

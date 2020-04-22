package day16_ForLoop;
import java.util.*;
public class Replit_066_Merge_Them {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        //YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        int indexNum1 = length1-1;
        int indexNum2 = length2-1;

        String merge = ""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+
                word1.charAt(2)+word2.charAt(2);
        String str = "";

        if(length1 != length2){
            str = "cannot merge";
        } else {
            str = merge;
        }
        System.out.println(str);


    }

}

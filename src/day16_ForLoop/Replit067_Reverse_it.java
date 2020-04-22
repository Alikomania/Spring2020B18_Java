package day16_ForLoop;
import java.util.Scanner;
public class Replit067_Reverse_it {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int length = word.length();
        int lastIndex = length-1;

        String str = "";
        if(length > 5){
            str = "Too long!";
        } else if(length < 5){
            str = "Too short!";
        } else {
            for(int i = lastIndex; i >= 0; i--){
                str += word.charAt(i);
            }

        }
        System.out.println(str);



    }



}

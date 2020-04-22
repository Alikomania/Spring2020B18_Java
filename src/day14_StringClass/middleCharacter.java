package day14_StringClass;

import java.util.Scanner;

/*
3. Write a Java method to display
the middle character of a string
  a) If the length of the string is
  even there will be two middle characters.
  b) If the length of the string is
  odd there will be one middle character.
        Input :
            elephant
        Output:
            The middle character in the string: ph
 */
public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next(); // bananas => length = 7
        // 0123456 => index num = 6
        String middleCharacter = ""; // to store the middle characters at the entd
        int totalChars = word.length(); // 7
        int middleNumber = totalChars / 2; // 7 / 2 => 3 (int is whole number)

        if (totalChars % 2 != 0) {
            middleCharacter += word.charAt(middleNumber);
            //  middleCharacter = middleCharacter + word.charAt(middleNumber);
        } else {
            // middleCharacter = middleCharacter + word.charAt(middleNumber - 1) + word.charAt(middleNumber);
        }       middleCharacter += word.charAt(middleNumber - 1) + "" + word.charAt(middleNumber);
        /// any thing we added to a string will return it as string



        System.out.println("Middle character: "+middleCharacter);



        /*
        int length = word.length();
        String even = word.substring(length/2-1, length/2+1 );
        String odd = word.substring(length / 2, length/2+1);

        if(length%2 == 0){
            System.out.println("The middle character in the string: "+even);
        } if(length%2 != 0) {
            System.out.println("The middle character in the string: "+odd);
        }
*/


    }
}

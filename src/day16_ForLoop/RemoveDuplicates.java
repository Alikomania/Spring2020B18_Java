package day16_ForLoop;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = scan.nextLine(); // ab
                                //    0123
        String result = ""; // abab // => we store the expected result in this variable
                            //        => like that: 1. "a" + .., 2. "ab"+.., 3. "abc"+..

        for(int i = 0; i < str.length()-1; i++) {
            //       length()-1

            /*
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }

            result += str.charAt(i); // abab
        }
        */

        // if(str.charAt(i) == str.charAt(i)+1) (Alternate if)

            if(result.contains(""+str.charAt(i))){
                continue;
            }

            result += str.charAt(i); // only gets executed if str.charAt(i) is not contained int the result

        }
        System.out.println(result);


    }
}

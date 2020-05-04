package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ExtractChars3 {
/*
4. write a program that can extract the special characters,
digits and alphabets from a string and stores them into separate ArrayLists of Character:

        DO NOT USE LOOPS
 */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        Character[] ch = new Character[arr.length];
        for (int i = 0; i < arr.length; i++){
            ch[i] = arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf( p -> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
     //   specialChars.removeIf( p -> Character.isDigit(p) || Character.isLetter(p));

        specialChars.removeAll(letters);
        specialChars.removeAll(digits);

        System.out.println(specialChars);


    }
}

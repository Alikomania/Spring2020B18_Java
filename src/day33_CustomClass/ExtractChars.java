package day33_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class ExtractChars {
/*
4. write a program that can extract the special characters,
digits and alphabets from a string and stores them into separate
 ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */
    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
            char[] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();
                        // also we can use .isAlphabetic
        for (char each : arr) if (Character.isLetter(each)) letters.addAll(Arrays.asList(each));
        else if (Character.isDigit(each)) digits.addAll(Arrays.asList(each));
        else specialChars.add(each);

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);









    }
}

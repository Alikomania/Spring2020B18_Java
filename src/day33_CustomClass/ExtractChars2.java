package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars2 {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            if (Character.isLetter(each)) letters.addAll(Arrays.asList(each));
            else if (Character.isDigit(each)) digits.addAll(Arrays.asList(each));
            else specialChars.add(each);
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);



    }
}

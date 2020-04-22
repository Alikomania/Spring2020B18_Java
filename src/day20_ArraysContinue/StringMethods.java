package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String myName = "Ali ";
        char[] ch = myName.toCharArray();
        System.out.println(Arrays.toString(ch)); // [A, l, i ] (Included the space)

        String str1 = "Cybertek School"; // you can add .equalsIgnoreCase() after "
        String str2 = "School Cybertek"; // you can add .equalsIgnoreCase() after "

        char[] ch1 = str1.toCharArray(); // [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray(); // [S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equalStr = Arrays.equals(ch1, ch2);

        System.out.println(equalStr); // true => str1 & str2 are build out of same character




    }
}

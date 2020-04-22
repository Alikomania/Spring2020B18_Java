package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java"; // 'J', 'a', 'v', 'a'

        char[] chars = name.toCharArray();
        System.out.println(chars[0]); // J
        System.out.println(chars[3]); // a

        String str = "I like Java";

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr)); // [I, like, Java]
/*
reverse sentence: day great is today
 */
        String sentence = "Today is great day";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Today, is, great, day]

        String result = "";

        for(int i = words.length-1; i >= 0; i--){
         //   String eachWords = words[i];
            result += words[i]+" ";
        //    System.out.print(eachWords+" "); // day great is Today
        }
        System.out.println(result); // day great is Today


        String str2 = "ABCD"; // {"A", "B", "C", "D"}

        String[] arr2 = str2.split("");
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr2)); // [A, B, C, D] => String
        System.out.println(Arrays.toString(ch2)); // [A, B, C, D] => char

        System.out.println("===================================");

        String ktr = "Where is the Ali Koca";

        String[] m = ktr.split(" ");
        char [] c = ktr.toCharArray();

        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(c));

        String r1 = "";

        for (int z = m.length-1; z >= 0; z-- ){
            r1 += m[z]+" ";
        }
        System.out.println(r1);




    }
}

package day25_MethodsRecap;

import Resources.Library;
import day16_ForLoop.RemoveDuplicates;

public class Test {

    public static void main(String[] args) {

        String str = "ABCDABABABABABA";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";
        int result2 = Library.Frequency(str1, str2);
        System.out.println(result2);

        String str3 = "NNNNFFFFFNNNJJJJJLLLLLNNNNNERRERTERTERRRR";
        String result3 = Library.FrequencyOfChars(str3);
        System.out.println(result3);

    }
}

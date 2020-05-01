package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Predicate2 {

    public static void main(String[] args) {

        Predicate<Character> specialCh = n -> n >= 32 && n <= 47;

        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('a', '!', '#', 'b', '*', '&'));
        ch.removeIf(specialCh);
        System.out.println(ch); // [a, b]

        System.out.println("============================================");

        Predicate<Integer> num = p -> p % 3 == 0 || p % 5 == 0;

        ArrayList<Integer> divisible3or5 = new ArrayList<>(Arrays.asList(5,15,2,5,35,45,55,65,75,80));
        divisible3or5.removeIf(num);
        System.out.println(divisible3or5); // 2



    }
}

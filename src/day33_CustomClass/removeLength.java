package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class removeLength {
/*
3. task:
			1. create an ArrayList of string
			called country names
			2. write a program that can remove all the country
			names that have length of 10 or greater
 */
    public static void main(String[] args) {

        ArrayList<String> countryName = new ArrayList<>();
        Predicate<String> length = p -> p.length() >= 10;
        countryName.addAll(Arrays.asList("Brazil", "France", "Italy", "Turkmenistan", "Kirgizistan", "Espain"));
        countryName.removeIf(length);
        System.out.println(countryName);


    }
}

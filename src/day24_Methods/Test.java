package day24_Methods;

import Resources.Library;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        String str = "Cybertek";

        String RevStr = Library.Reverse(str);

        System.out.println(str.equalsIgnoreCase(RevStr));

        int[] arr = {10000, 3000, 2000, 40000, 50000, 1000000};

        arr = Library.sortDesending(arr);

        System.out.println(Arrays.toString(arr));



    }




}

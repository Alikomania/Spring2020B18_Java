package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String r = Arrays.toString(arr); // Array MUST BE converted to String before we print

        System.out.println(r); // [1, 2, 3]

        String names [] = {"Madina", "Fatih", "Osman"};

        System.out.println(Arrays.toString(names)); // [Madina, Fatih, Osman]

        double[] nums = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(nums)); // [10.0, 20.0, 30.0, 40.0, 50.0]

        System.out.println( nums[0]); // 10.0

        System.out.println( nums[0]+1); // 11.0





    }
}

package day24_Methods;

import java.util.Arrays;

public class RetrunMethods_Practice {

    /*
    => create a function that can print the maximum number
    from any given integer array
     */

    public static void main(String[] args) {

        int[] arr = {9,8,7,100,200,50,40};
        int max = maxNumber(arr);
        int min = minNumber(arr);

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);


    }

    public static int maxNumber(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static int minNumber (int[] arr1){
        Arrays.sort(arr1);
        return arr1[0];
    }





}

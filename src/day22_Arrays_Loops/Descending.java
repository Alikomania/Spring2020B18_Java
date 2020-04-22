package day22_Arrays_Loops;

import java.util.Arrays;

/*
 2. write a program that sort the array in descending order
 */
public class Descending {
    public static void main(String[] args) {

        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); // ascending
        System.out.println(Arrays.toString(arr)); // [-1, 2, 10, 70, 78, 500]

        int[] RevArr = new int[arr.length];

        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++){
            RevArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr)); // [500, 78, 70, 10, 2, -1]






    }
}

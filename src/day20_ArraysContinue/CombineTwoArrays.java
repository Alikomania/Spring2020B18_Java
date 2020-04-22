package day20_ArraysContinue;
/*
practice task:

	write a program that can combine two arrays of any lengths,
	and returns the third array

	arr1 ==> [1,2,3];
	arr2 ==> [4,5,6,7];

	arr3 ==> [1,2,3,4,5,6,7];
 */

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {9,10,11,12,13,14,15};

        int[] arr3 = new int[arr1.length + arr2.length]; // can contain all the elements from array1 and array2

        for(int i = 0; i < arr1.length; i++){

            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){

            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));






        /*
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12,13,14};
        int[] arr3 = new int[arr.length + arr2.length];

        int count = 0;

        for(int i = 0; i < arr.length; i++){

            arr3[i] = arr[i];
            count++;
        }
        for(int z = 0; z < arr2.length; z++){

            arr3[z] = arr2[z];
            count++;
        }





        System.out.println(Arrays.toString(arr2));

         */



    /*
     int[] arr1 = {1, 2, 3};
    int[] arr2 = {4, 5, 6, 7};
    int[] arr3 = new int[arr1.length+arr2.length];
    int add=0;
    for (int i = 0; i<arr1.length; i++) {
        arr3[i] = arr1[i];
        add++;}
    for (int m = 0; m <arr2.length; m++) {
         arr3[add] = arr2[m];
    add++;}
    for(int i = 0; i < arr3.length;i++) {
        System.out.print(arr3[i]);
     */

    }
}

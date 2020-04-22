package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        //           0 1 2

        // n dimensional array contains (n-1) dimensional arrays

        // 2D array: [index num of ] [index num of elements]
        int[][] arr2D = {  {1,2,3}, {4,5,6}   };
        //                    0         1

        int[] arr1D = arr2D[0]; // {1,2,3}

        System.out.println(Arrays.toString(arr1D)); // [1, 2, 3]

        System.out.println(Arrays.toString(arr2D[0])); // [1, 2, 3] // single dimensional array from arr2D

        System.out.println( arr2D[0][2]); // 3 => only returns the single element. therefore we use not Arrays.toString method

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6]]

        System.out.println( Arrays.toString( arr2D[1] ) ); // [4, 5, 6]

        for (int eachElement : arr2D[0]){
            System.out.println(eachElement); // 1 2 3
        }

        for (int i = 0; i < arr2D[0].length; i++){
            int num = arr2D[0][i];
            System.out.println(num); // 1 2 3

        }



    }
}

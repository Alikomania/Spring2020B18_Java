package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3}; // to store multiple data

    //                     0 1 2    0 1 2 3
        int[][] arr2D = { {1,2,3}, {4,5,6,7} };
            // index num => 0    ,    1

        System.out.println(arr2D.length); // length => 2

        int[] arr1D = arr2D[1]; // {1,2,3};
        System.out.println(Arrays.toString(arr1D)); // [4, 5, 6, 7]

        int num1 = arr2D[1] [3];
        System.out.println(num1); // 7

    // {'A', 'B'};
    //  index number =>      0  , 1       0,   1,   2      0    1    2
        char[] [] ch2D = {  {'A', 'B'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}   };
        // index:               0     ,         1               2

        char c1 = ch2D[1] [0];
        System.out.println(c1); // D

        char[] ch2 = ch2D[2]; // {G, H, I}

        System.out.println(Arrays.toString(ch2)); // [G, H, I]


        String [] [] str2D = {  {"A", "B", "C"} , {"D", "E", "F"}, {"G", "H", "I"}  };

        String r1 = str2D[2] [1]; // H






    }
}

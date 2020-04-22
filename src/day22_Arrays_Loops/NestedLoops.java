package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {

        //                     0    1       0    1    2       0    1    2    3
        char[][] arr2D = {   {'A', 'B' }, {'C', 'D', 'E' }, {'F', 'J', 'H', 'I' }    };
        //                      0               1                    2
        // each index in arr2D MUST be single dimensional array
        /*        j  i => line 44
            arr2D[0][0]
            arr2D[0][1]

            arr2D[1][0]
            arr2D[1][1]
            arr2D[1][2]
            ...
            ...
         */

        // arr2D[0] => {'A', 'B'} => single dimension

        for (int i = 0; i < arr2D[0].length; i++){
            System.out.println(arr2D[0][i]); // A B
        }

        // arr2D[1] => {'C', 'D', 'E' } => single dimension

        for (int i = 0; i < arr2D[1].length; i++){
            System.out.println(arr2D[1][i]); // C D E
        }

        // arr2D[2] => {'F', 'J', 'H', 'I' } => single dimension

        for (int i = 0; i < arr2D[2].length; i++){
            System.out.println(arr2D[2][i]); // E F J H I
        }
        System.out.println("========================================");

        for (int j = 0; j < arr2D.length; j++){ // j: representing index number of 1D array
                          // => line 13 =>      // i: representing index number of 2D array

            for (int i = 0; i < arr2D[j].length; i++){ // 0 => arr2D[0], 1 => arr2D[1], 2 => arr2D[2]
                System.out.println(arr2D[j][i]); // A B C D E E F J H I
            }

        }







    }
}

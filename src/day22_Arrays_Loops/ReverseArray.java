package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        for (int i = arr.length-1; i >= 0; i--){
            int eachNum = arr[i];
            System.out.println(eachNum);
        }
        System.out.println("======================================");

        int[] revArr = new int[arr.length]; // {0,0,0,0,0}

        revArr[0] = arr[4];

        System.out.println(Arrays.toString(revArr)); // [5, 0, 0, 0, 0]

        /*
               i        j
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
 */

        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++){
            revArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(revArr));





    }
}

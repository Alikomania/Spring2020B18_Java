package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Equal {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result); // true

        int[] arr3 = {3,2,1};
        int[] arr4 = {1,2,3};
        boolean result2 = Arrays.equals(arr3, arr4);
        System.out.println(result2); // false

        int[] arr5 = {3,2,1};
        int[] arr6 = {2,1,3};

        Arrays.sort(arr5); // [1, 2, 3]
        Arrays.sort(arr6); // [1, 2, 3]

        boolean result3 = Arrays.equals(arr5, arr6);

        System.out.println(result3); // true

        int[] array1 = {1,2,3};
        int[] array2 ={1,2,3,4};

        boolean result4 = Arrays.equals(array1, array2);
        System.out.println(result4); // false (because lengts are not same)



    }
}

package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1 = {10, 19,5,2,3, 4, 5,1, -1, 300};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1)); // [-1, 1, 2, 3, 4, 5, 5, 10, 19, 300]

        System.out.println("First minimum number is: "+ arr1[0]);
        System.out.println("Second minimum number is: "+ arr1[1]);

        System.out.println("First max number is: "+ arr1[ arr1.length-1]);
        System.out.println("Second max number is: "+ arr1[ arr1.length-2]);


        char[] ch = {'z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch)); // [A, B, D, D, E, W, Y, z] (Print to according the ascii table)

        System.out.println("==============================================");

        String [] names = {"Deniz", "Osman", "Rustem", "Anna", "Ali"};
        String[] names2 = {"Deniz", "Osman", "Rustem", "ANna", "Ali"};
        Arrays.sort(names);
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names)); // [Ali, Anna, Deniz, Osman, Rustem]
        System.out.println(Arrays.toString(names2)); // [ANna, Ali, Deniz, Osman, Rustem]
                            // symbol < number < uppercase < lowercase
        System.out.println("============================================");

        int[] arr = {3, 1, 4, -1, 100, -100, 200, 155};
        Arrays.sort(arr);

        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for (int i = arr.length-1; i >= 0; i--){
        //    System.out.print( arr[i] + " "); // 200 155 100 4 3 1 -1 -100
            arrDesc[j] = arr[i];

            j++;
        }
        System.out.println(Arrays.toString(arrDesc));





    }
}

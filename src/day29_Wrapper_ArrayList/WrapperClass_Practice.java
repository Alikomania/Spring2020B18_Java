package day29_Wrapper_ArrayList;

import java.util.Arrays;

/*
Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
 */
public class WrapperClass_Practice {
    public static void main(String[] args) {

        double[] arr = {1,2.5, 3, 3.5, 4.5};

        double max = Double.MIN_VALUE;

        for (double each : arr){ // 5 each: 1,2.5, 3, 3.5, 4.5

            if (each > max){
                max = each;
            }
        }
        System.out.println(max);

        System.out.println("=========================================================");

        String[] arr1 = {"1","2.5", "3", "3.5", "4.5"};

        for (String each : arr1){ // 5 each: 1,2.5, 3, 3.5, 4.5

            double num = Double.parseDouble(each);

            if (num > max){
                max = num;
            }
        }
        System.out.println(max);

        System.out.println("================================================");

        String[] arr3 = {"100","2.5", "3", "3.5", "4.5", "55"};

        double[] numbers = new double[arr3.length]; //[0.0, 0.0, 0.0, 0.0, 0.0]

        for (int i = 0; i < arr3.length; i++){
            numbers[i] = Double.parseDouble(arr3[i]);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);







    }
}

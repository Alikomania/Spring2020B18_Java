package day21_MultiDimensionalArrays;
/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class AverageNumber {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        // average: sum of all numbers / length

        int length = arr.length; // total number of the elements
        int sum = 0;

        for(int i = 0; i < length; i++){
            int eachNum = arr[i];
            sum += eachNum; // or no need the line 22 and just sum += arr[i]. same result
        }
        int average = sum / length;
    // double average = sum / (double)length; // if we need the decimal number (like line 32)
        System.out.println(average);

        System.out.println("==========================================");

        int[] arr2 = {1,2,2}; // 5/3

        System.out.println(5/3); // 1
        System.out.println(5/(double)3); // 1.6666666666666667


    }
}

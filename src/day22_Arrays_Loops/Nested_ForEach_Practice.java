package day22_Arrays_Loops;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
        // 3. calculate sum of even numbers
        // 4. calculate sum of odd numbers

        int countOdd = 0;
        int sumofOdd = 0;
        int sumofEven = 0;

        for (int[] each1DArrays : numbers){
            for (int eachElement : each1DArrays){
                if (eachElement % 2 == 0){

                    System.out.print(eachElement+" ");
                    sumofEven += eachElement;

                } else {
                    sumofOdd += eachElement;
                    countOdd++;
                }

            }
        }
        System.out.println();
        System.out.println("Count of Odd: "+countOdd);
        System.out.println("Sum of Odd: "+sumofOdd);
        System.out.println("Sum of Even: "+sumofEven);





    }
}

package OfficeHours.Practice_04_15_2020;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        // print all the odd numbers with regular for loop MUST USE continue statement

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                int num = numbers[i][j];
                if (num % 2 == 0){
                    continue;

                }
                System.out.println(num);
            }

        }
        System.out.println("=======================================");


        // print all the even numbers with for each loop MUST USE continue statement

        for ( int[] each1DArray : numbers){
            for (int eachElement : each1DArray){
                if (eachElement % 2 != 0){
                    continue;
                }
                System.out.println(eachElement);
            }

        }







    }
}

package day22_Arrays_Loops;

public class NestedLoops_Practice {
    public static void main(String[] args) {

        int[][] numbers = {  {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        // 1. print all even numbers in same line
        // 2. count odd numbers ==> return the total odd number

        int countOdd = 0;
        int countEven = 0;

        for (int z = 0; z < numbers.length; z++){
            for (int t = 0; t < numbers[z].length; t++){
                int num = numbers[z][t];
                if(num % 2 != 0){
                    System.out.print(num+" ");
                } else {
                    countEven++;
                }
            }
        }
        System.out.println();

        System.out.println(countEven);

        System.out.println();











        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                int num = numbers[i][j];
                if (num % 2 == 0){
                    System.out.print(num+ " ");
                } else {
                    countOdd++;
                }

            }
        }
        System.out.println();
        System.out.println(countOdd);









    }
}

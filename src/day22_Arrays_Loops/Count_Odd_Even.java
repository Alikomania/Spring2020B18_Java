package day22_Arrays_Loops;

/*
 4. write a program that can count the even and odd number
 from an array of integers
 MUST USE FOR EACH LOOP AND CONTINUE STATEMENT

 */
public class Count_Odd_Even {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int countOdd = 0;
        int countEven = 0;

        for (int eachNumbers : arr){

            /*
            if (eachNumbers % 2 != 0){
                countOdd++;
            }
            else {
                countEven++;
            }

             */

            if (eachNumbers % 2 == 0){
                countEven++;
                continue;
            }
            countOdd++;

        }

        System.out.println("Even Numbers: "+countEven);
        System.out.println("Odd Numbers: "+countOdd);




    }
}

package day20_ArraysContinue;
/*
 Warmup tasks:
    1. write a program that can find the maximum number from
    any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T
                COVERED IN THE CLASS
    2. write a program that can find the minimum number
    from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE
                HAVN'T COVERED IN THE
  */
public class Max_Min {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8,9};
        int lastindex = arr.length-1;
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i <= lastindex; i++){

            if(arr[i] >= max){ // array's index are compared with each other,
                            // and whichever is greater will be assigned to the max number
                max = arr[i];
            }

            if(arr[i] < min){

                min = arr[i];
            }

        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);






    }
}

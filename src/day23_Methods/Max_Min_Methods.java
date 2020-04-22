package day23_Methods;

import java.util.Arrays;

public class Max_Min_Methods {
    public static void main(String[] args) {

        int[] barr = {1,2,3,4,5,6,7,8,9,10};

        MaxNumber(barr);
        MinNumber(barr);
        Descending(barr);




    }




    public static void MaxNumber(int[] arr){

        int lastindex = arr.length-1;
        int max = arr[0];
        for (int i = 0; i <= lastindex; i++){
           if (arr[i] >= max){
               max = arr[i];
           }
        }
        System.out.print("Maximum number: "+max);
        System.out.println();


    }

    public static void MinNumber(int[] arr){

        int lastindex = arr.length-1;
        int min = arr[0];
        for (int i = 0; i <= lastindex; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Minimum number: "+min);
        System.out.println();


    }

    public static void Descending(int[] arr1){
        int lastindex = arr1.length-1;
        for (int i = lastindex; i >= 0; i--){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }


}

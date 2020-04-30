package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
   /*
        1. write a program that can remove duplicates from an arraylist
        ArrayList<String> noDuplicate = new ArrayList<>();
  for (int i=0;i<list.size();i++){
      if(!noDuplicate.contains(list.get(i))){
          noDuplicate.add(list.get(i));
      }
  }
  System.out.println(noDuplicate); // [A, B, C]
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));
                // expected result : [1,2,3]
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list){ // each:
            if ( ! result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("===================================");

        /*
        write a program that can remove duplicates from an array of integer
                do not use for eah loop
         */
        Integer[] arr1 = {1,1,2,2,3,3};

        ArrayList<Integer> nonDup = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            if ( ! nonDup.contains(arr1[i])){
                nonDup.add(arr1[i]);
            }
        }
        System.out.println(nonDup);


    }
}

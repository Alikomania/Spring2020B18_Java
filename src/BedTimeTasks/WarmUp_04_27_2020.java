package BedTimeTasks;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class WarmUp_04_27_2020 {
/*
WARMUP TASKS:

 */


    public static void main(String[] args) {
  /*
  1. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
   */

        String str = "Today's date is 04/27/2020";

        int sum = 0;
       for (int i = 0; i < str.length(); i++){
           String result = "";
           char ch = str.charAt(i);
           if (ch >= 48 && ch <= 57){
             result += ch;
             sum += Integer.parseInt(result);
           }
       }
       System.out.println(sum);

       System.out.println("=================================================");

 /*
 2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
  */
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 10; i <= 100; i += 10){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        System.out.println(reversed);


        ArrayList<Integer> list2 = new ArrayList<>();

        for (int j = 5; j <= 100; j += 10){
            list2.add(j);
        }
        System.out.println(list2);

        ArrayList<Integer> reversed2 = new ArrayList<>();

        for (int j = list2.size()-1; j >= 0; j--){
            reversed2.add(list2.get(j));
        }
        System.out.println(reversed2);

        System.out.println("===============================================================");

   /*
   3. write a program that can print out the unique elements from an int array
           HINT: store all the unique elements of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
    */
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7,};

        ArrayList<Integer> unique = new ArrayList<>();

        for (int each : arr){
           int count = 0;
           for (int each1 : arr){
               if (each == each1){
                   count++;
               }
           }
           if (count == 1){
               unique.add(each);
           }
        }
        System.out.println(unique);


        int[] arr1 = {11, 22, 22, 33, 44, 44, 55, 55, 66, 77,};

        ArrayList<Integer> uni = new ArrayList<>();

        for (int i = 0; i <= arr1.length-1; i++){
            int count1 = 0;
            for (int j = 0; j <= arr1.length-1; j++){
                if (arr1[j] == arr1[i]){
                    count1++;
                }
            }
            if (count1 == 1){
                uni.add(arr1[i]);
            }
        }
        System.out.println(uni);

        System.out.println("==============================================");

 /*
 4.  write a program that can find the unique elements from
 an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
  */

        ArrayList<Integer> elements = new ArrayList<>();

        elements.add(10);
        elements.add(9);
        elements.add(9);
        elements.add(11);
        elements.add(99);
        elements.add(77);
        elements.add(77);
        elements.add(10);

        ArrayList<Integer> uniElements = new ArrayList<>();

        for (Integer each : elements){
            int count = 0;
            for (Integer each1 : elements){
                if (each == each1){
                    count++;
                }
            }
            if (count == 1){
                uniElements.add(each);
            }
        }
        System.out.println(uniElements);

        System.out.println("=================================================");

  /*
  5. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
   */

        String[] arrst1 = {"A", "B", "C"};
        String[] arrst2 = {"D", "E", "F", "G"};

        ArrayList<String> force = new ArrayList<>();

        for (String each : arrst1){
            force.add(each);
        }
        for (String each1 : arrst2){
            force.add(each1);
        }
        System.out.println(force);












    }
}

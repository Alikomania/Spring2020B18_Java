package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // {1,2,1}

        list.add(1);
        list.add(2);
        list.add(1);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            int count = 0;
            for (Integer each : list){
                if (each == list.get(i)){
                    count++;
                }
            }
            if (count == 1){
                uniques.add(list.get(i));
            }

        }
        System.out.println(list);
        System.out.println(uniques);

        System.out.println("=======================================================");

        // This loop will repeat as many times as the size of ArrayList. It will repeat the below steps for each element in the ArrayList
        for (int i =0 ; i < list.size(); i ++) {
            int count = 0;
            // if using for each loop: my collection of data is list, and each element is an Integer
            // This loop will check how many times each element is repeated in the ArrayList
            for (Integer each : list) {
                // how can I create the condition to compare each with every element? by if statement:
                if (each == list.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));
            }
        }






    }
}

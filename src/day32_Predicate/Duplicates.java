package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    /*
    write a program that can return the duplicated values
    from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            int count = 0;
            for (String each : list ) {
                if (each.equals( list.get(i))){
                    count++;
                }
            }
            if (count > 1 && ! duplicates.contains(list.get(i))){
                duplicates.add(list.get(i));
            }

        }

        /*
        // list.get(0) ==> "A"
        int count = 0;
        for (String each : list ) {
            if (each.equals( list.get(0))){
                count++;
            }
        }
        if (count > 1){
            duplicates.add(list.get(0));
        }

         */
        System.out.println(duplicates);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5));

        list2.set(0, list2.get(4)); // [5, 2, 3, 4, 5]
        list2.set(4, list2.get(0));
        System.out.println(list2); // [5, 2, 3, 4, 5]

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for (Integer each : list3){

            if (each % 2 != 0){
                continue;
            }
            System.out.println(each+" ");
            break;// 2
        }

    }
}

package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2



    1. ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));//7

        int max = Collections.max(list);
        ArrayList<Integer> exceptMax = new ArrayList<>();
        for (Integer each:list){
        if(each != max){
            exceptMax.add(each);
        }
        }
        System.out.println(Collections.max(exceptMax));


    2. ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));//2

        int min=Collections.min(list);
        ArrayList<Integer>exceptMin=new ArrayList<>();
        for(Integer each:list){
        if(each!=min){
           exceptMin.add(each);
        }
        }
        System.out.println(Collections.min(exceptMin));

         */

        ArrayList<Integer> list1 = new ArrayList<> (Arrays.asList(1,2,3,4,5,6,7,8,8));

        Integer maxNum = Collections.max(list1);
        list1.removeAll(Arrays.asList(maxNum));

        int secondMax = Collections.max(list1);
        System.out.println(secondMax);



        System.out.println("========================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

        Integer minNum = Collections.min(list2);

        list2.removeAll(Arrays.asList(minNum));

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("=====================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3); // [1, 2, 3, 4, 5]

        Collections.swap(list3, 0, 4);
        System.out.println(list3); // [5, 2, 3, 4, 1]

        System.out.println("=============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer")); // Irina

        /*
            names.set(0, "Irina");
            names.set(1, "Irina");
            names.set(5, "Irina");

         */

        Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names); // [Irina, Irina, Mary, Sha, Fatih, Irina]






    }


}

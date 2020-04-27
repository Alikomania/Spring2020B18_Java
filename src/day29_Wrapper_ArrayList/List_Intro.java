package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        // ArrayList<DataType>  listName = new ArrayList<DataType>();

        ArrayList<Integer> scores = new ArrayList<Integer>(); // size : 0
                                    // add five elements, size: 5
                                    // remove two elements, size: 3

        scores.add(10); // Autoboxing     size: 1
        scores.add(20); // Autoboxing   size: 2
        scores.add(30); // size: 3

        System.out.println(scores);

        Integer a1 = scores.get(2); // none 'boxing'

        int a2 = scores.get(2); // unboxing

        double a3 = scores.get(2); // unboxing

        System.out.println(a1); // 30
        System.out.println(a3); // 30.0

      //  System.out.println( scores.get(100) );

        System.out.println("===============================================");

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(50);
        num.add(40);
        num.add(30);
        num.add(20);
        num.add(10);

        int max = Integer.MIN_VALUE;

        for (int each : num){

            if (each > max){
                max = each;
            }
        }
        System.out.println(max);



    }
}

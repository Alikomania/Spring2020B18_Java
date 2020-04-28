package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(5); // 0
                list1.add(7); // 1 => 2 (after add the 6)
                list1.add(8); // 2 => 3 (after add the 6)

                list1.add(1, 6); // 1
                        // {5,6,7,8}
        //        list1.add(7, 10); // index out of bound

            list1.set(3, 9); // [5, 6, 7, 9]

        System.out.println(list1); // [5, 6, 7, 9]

        System.out.println("===================================================");

        int[] arr = {1,2,3,4}; // {1,2,3,5}
        arr[3] = 5;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5]

        ArrayList<String > list2 = new ArrayList<>();
        list2.add("A"); // A
        list2.add("B"); // A, B
        list2.add(1, "C"); // A, C, B
        list2.add(1, "D"); // A, D, C, B

        // [A, D, C, B]

        list2.set(3, "F"); // [A, D, C, F]
        list2.set(2, "E"); // [A, D, E, F]

        System.out.println(list2); // A, D, E, F

        System.out.println("===================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
                list3.add(1); // 0
                list3.add(2); // 1
                list3.add(3); // 2
                list3.add(4); // 3

        // {1,2,3,4}
    //     int a = 1; // remove the index, NOT THE OBJECT
    //         list3.remove(a); // => {1,3,4}
    //         list3.remove(2); // => [1, 3]

        Integer a = 1;
        list3.remove(a); // {2,3,4} // remove the object, NOT THE INDEX

        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
                    list4.add(10);
                    list4.add(20);
                    list4.add(30);
                    // {10, 20, 30}

    // 1st way =>   list4.remove(1);

        Integer a2 = 20; // <= second way
        list4.remove(a2);

        boolean r1 = list4.remove(a2); // returns boolean

        System.out.println(list4);
        System.out.println(r1);






    }
}

package day30_ArrayList;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                    list.add("A"); //0
                    list.add("B");// 1
                    list.add("C");// 2

    // first way =>    list.remove(1); => You CANNOT assign the boolean

        String str = "F";
        boolean r1 = list.remove(str); // false

        boolean r2 = list.remove("A"); // true

        System.out.println(list); // B, C
        System.out.println(r1); // true
        System.out.println(r2); // true

        list.clear(); // []
        System.out.println(list); // []
        System.out.println(list.size()); // 0

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); // 0
        list2.add(1); // 1
        list2.add(2); // 2
        list2.add(3); // 3

        // {1,1,2,3}

        int num1 = list2.indexOf(1); // => at the that 1 is index number 0. NOT the second one.
            // Integer = int // Autoboxing

        System.out.println(num1);

        int num2 = list2.indexOf(100);
        System.out.println(num2); // -1 => which mean (negative number) its not exist in this arraylist.

        int num3 = list2.indexOf(3);
        System.out.println(num3); // 3


    }
}

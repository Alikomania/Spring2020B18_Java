package OfficeHours.Practice_03_18_2020;

public class LogicalOperators_Practice {
    public static void main(String[] args) {

        // ||, &&, !

        boolean r1 = "Muhtar" != "Bad Guy"; // true
        boolean r2 = "Muhtar" == "Bad Guy"; // false

        System.out.println(r1); // true
        System.out.println(r2); // false

        boolean r3 = 10 >= 9; // true
        System.out.println(r3); // true

        boolean r4 = !false == !true; // false
        //      r4 = true == false ==> false
        System.out.println(r4); // false

     // || : as long as one condition is true ==> true

        boolean result1 = 9 != 8 || 9 == 8;
                //          true || false ==> true
        System.out.println(result1); // true

         //  boolean result2 = 9 != 8 && 9 == 8;
        //              true && false ==> false
     //   System.out.println(result2); // false

        System.out.println("==============================");

        boolean result2 = 'a'== 'A' || 'A' == 'b';
            //              false ||  false  ==> false
        System.out.println(result2);

    // && : as long as one condition is false ==> false

        boolean result3 = 6 > 5 && 6 < 4;
                //       true  &&  false ===> false
        System.out.println(result3); // false

        boolean result4 = !false != false && !true == false;
            // result4 = true   != false  && false = false
            //         =    true    &&  true  ===> true
        System.out.println(result4); // true



    }
}

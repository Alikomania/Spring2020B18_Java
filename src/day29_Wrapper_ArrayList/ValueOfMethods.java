package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integer, returns 123
        System.out.println(a); // 123

        double b = Integer.valueOf(str); // unboxing
        // double = Integer

        System.out.println(b); // 123.0

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double // none 'boxing'

        double d2 = Double.valueOf(str2); // 15.5
// double (primitive) = Double (wrapper class) => Unboxing

        System.out.println(d1); // 15.5
        System.out.println(d2); // 15.5

        System.out.println(d1 == d2); // true

        System.out.println("============================================");

        int z1 = 2000;
        // Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1); // Boolean, true
                // Boolean = Boolean // none 'boxing'

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        // boolean = Boolean // unboxing

        System.out.println(t1); // true
        System.out.println(t2); // true

        System.out.println("====================================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum); // 2147483647 (maximum number of int)

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2); // 1.7976931348623157E308 (maximim number of double)

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum); // -2147483648 (minimum number of int)

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3); // 127 (maximum number of byte)

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2); // -128 (minimum number of byte)

        System.out.println("====================================================");

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0] => default value

        Boolean[] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2)); // [null, null, null] => default value



    }
}

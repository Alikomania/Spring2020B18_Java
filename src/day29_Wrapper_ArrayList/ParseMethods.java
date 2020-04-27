package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str); // 123
        System.out.println(str + 1); // text
            //              "123" + 1 => "1231" (Concatenation)
        System.out.println(a1+1); // number
             //              123 + 1 => 124 (Addition)

        byte b1 = Byte.parseByte(str); // byte = 123

        System.out.println(b1); // number

        Integer I1 = (int)Byte.parseByte(str); // AutoBoxing
    // => or
        int i1 = b1;
        Integer I2 = i1;
        System.out.println(I2); // 123

        String str2 = "10.5";

        float f1 = Float.parseFloat(str2); // float 10.5
        System.out.println(f1); // 10.5

        double d1 = Double.parseDouble(str2); // double 10.5
        System.out.println(d1);

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3); // long => 3147483647
        System.out.println(num1);

        Long num2 = Long.parseLong(str3); // => autoboxing
        System.out.println(num2);

        double num3 = Double.parseDouble(str3); // double => 3.147483647E9
        System.out.println(num3);

        String result1 = "true";

        boolean r1 = Boolean.parseBoolean(result1); // boolean
        System.out.println(r1); // true
        System.out.println(!r1); // false

        String result2 = "Today is Monday"; // not matching "true" or "false" ==> false

        boolean r2 = Boolean.parseBoolean(result2);
        System.out.println(r2); // false

        String result3 = "TrUE"; // matching to "true". => parse method is not case sensitive.
        boolean r3 = Boolean.parseBoolean(result3);
        System.out.println(r3); // true

        String result4 = "fALsE"; // matching to "false". Because LINE 49.
        boolean r4 = Boolean.parseBoolean(result4);
        System.out.println(r4); // false



    }
}

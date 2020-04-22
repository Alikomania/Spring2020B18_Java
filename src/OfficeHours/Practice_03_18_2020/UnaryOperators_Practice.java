package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {
    // post : first passes the value, then increase it by 1
        int a = 20;
        System.out.println(a++); // 20
        System.out.println(a); // 21

        int b = 30;
        int c = b--; // c = 30, b = 29;
        System.out.println(b); // 29
        System.out.println(c); // 30


        // pre: changes the value immediately

        int x = 200;
        System.out.println( --x ); // 199
        System.out.println(x); // 199

        int z = 100; // 101 / 100 / 99 / 100
        z = z++ + --z - z-- + ++z;
    //  z = 100 + 100 - 100 + 100 ==> 200
        System.out.println(z); // 200

        int u = 900; // 901 / 902 / 903
        int r = - ++u + ++u + -u++;
     //    r = - 901 + 902  + -902;
        // r = 1 + -902
        // r = -901

        System.out.println(r); // -901
        System.out.println(u); // 903






    }


}

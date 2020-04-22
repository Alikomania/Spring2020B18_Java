package day05_Unary_ShorthandOperators;

public class N1 {

    public static void main(String[] args) {

        System.out.println("Result A"+ 0 + 1);
        System.out.println("Result B" + (1) + (2) );



      //  int a = 3,  b = 2;

       // long c = (a+b) * 2 / 3 % 2 ;

       // System.out.println(c);

        System.out.println (  (int)(10.0/3)   );

      //  int  x =  10;

       // int  y =  x++;

      //  System.out.println( y++  + "  " +  x++  + "  " + y);
        //                  10   +         11    +     11

        System.out.println("5 + 2 = " + 3+4);
        System.out.println("5 + 2 + " + (3+4));

        int  x =  10;

        int  y =  x++;

        System.out.println( y++  + "  " +  x++  + "  " + y);

        long l = 55;
        int i = 44;
        short s = 33;
        byte b = 22;

        i = (int) l; // 55
        s = (short) i; // 44
        b = (byte) s; // 33

        System.out.println("l = " + l);
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        System.out.println("b = " + b);

    }
}

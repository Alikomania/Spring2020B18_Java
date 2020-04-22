package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        // implicit casting: done automatically
        int a = 10;
        long b = a; // implicit castin is done automatically
            // b= 10L;


        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting


        // explicit casting:

        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snum = (short) Inum;
        short Snum1 = (byte) Inum;

        double Dnum = 5.5;
       // float Fnum = (float) Dnum; // 5.5

        float Fnum = (int) Dnum;
        System.out.println(Fnum);



        System.out.println(Fnum + 1);

        double D1 = 10.5;

        float F1 = 60.5f;
        int I1 = (int) F1;

        long largeNum = 99999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum); // it gives a different number.
                                // because number (99999999) is out of int range

        char ch1 = 'a';
        short sh1 = (short) ch1;
        System.out.println(sh1);

        char ch2 = 23456;

        double dbl1 = ch2;
        System.out.println(dbl1);






    }



}

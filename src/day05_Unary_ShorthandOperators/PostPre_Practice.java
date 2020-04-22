package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {
        int a = 50; // 49
        a = --a + a++ + a-- + a++;
        //  49  + 49  + 50  + 49  = 197
        System.out.println(a);

        int b = 1; // -1
        b = -b-- + b++ / -b-- * --b;
        // -1   + 0   /  -1    * -1 =
        // -1   + (0  /  -1)    * -1 =
        // -1   + (0 * -1) =
        // -1 + 0 =
        // -1
        System.out.println(b);


        int ivar = 100;
        double dvar = 123;
        float fvar = 200;

      /*  ivar = fvar;
        fvar = ivar;
        dvar = fvar;
        fvar = dvar;
        dvar = ivar;
        ivar = dvar;
*/
    }
}

package day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int a = 100; // primitive

        Integer b = a; // wrapper class

        short s1 = 200;
        int n1 = s1;        // Wrapper classes are dedicate to own primitives(not the others)
// ==>    Integer N1 = s1; // Integer is dedicated to int primitive (not the others)
                         // implicit casting is works between primitives but doesn't work in wrapper class
       Integer n2 = n1;
       // ======================================================

        int a1 = 20;
        float f1 = a1;

 //     Float F2 = a1; ==> We can't
        Float f2 = f1;

        Integer I1 = 200;
        int a2 = I1;

        Byte B1 = 126;
        int a3 = B1; // Unlike LINE 11, between primitives are assign
                        // implicit casting wrapper classes

        System.out.println(a3); // 126



    }
}

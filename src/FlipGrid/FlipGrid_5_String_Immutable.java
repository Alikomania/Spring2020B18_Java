package FlipGrid;

import javax.crypto.spec.PSource;

public class FlipGrid_5_String_Immutable {

    public static void main(String[] args) {

        // String literal:
        String s1 = "Cat"; // in the String Pool.
        String s2 = "Cat"; // in the String Pool. Same object with s1

        // new keyword:
        String s3 = new String("Cat"); // in the Java Heap. independent.
        String s4 = new String("Cat"); // in the Java Heap. different object


        System.out.println("1st statement: " + (s1 == s2));

        System.out.println("=======================================");

        System.out.println("2nd statement: " + (s3 == s4));

        System.out.println("=======================================");

        s1.concat(s2);
        System.out.println("After concat s1 is: " + s1);

        String b = s1.concat(s2);
        System.out.println("Change reference to another one: " + b);




    }





}

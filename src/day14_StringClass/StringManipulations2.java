package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = " ";

        boolean bool1 = str.isEmpty(); // false
        System.out.println(bool1);

        String username = "";

        if(username.isEmpty()){
            System.out.println("Please provide the user name first");
        }

        String s1 = "Cat"; // String literal
        String s2 = new String("Cat"); // new keyword

        System.out.println(s1 == s2); // => false, different memory locations, different objects

        System.out.println( s1.equals(s2) ); // true

        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 = "Lion";

        String z5 = "tiger";

        System.out.println(z1 == z2); // false different memory locations, different objects
        System.out.println(z2 == z3); // false different memory locations, different objects
        System.out.println(z1 == z3); // true => because both are in the same memory, wich is String Pool

        System.out.println("===============================");

        // equal methods:
        System.out.println( z1.equals(z2) ); // true
        System.out.println( z2.equals(z3) ); // true
        System.out.println( z1.equals(z3) ); // true
        System.out.println( z3.equals(z4) ); // false => because those are two different TEXTS
        System.out.println( z3.equals(z5) ); // false => because those are two different TEXTS (sensetive lower/upper case)





    }
}

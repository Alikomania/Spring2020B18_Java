package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {

    // Literal String:
        String str1 = "Cat"; // to go String Pool

    // new keyword:
        String str2 = new String("Cat"); // to in Java Heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2);

        String str3 = "Cat"; // String pool (same object => like str1)

        System.out.println(str1 == str3); // true

    // new keyword:
        String str4 = new String("Cat"); // independent. different object, like str2
        System.out.println(str2 == str4); // false. because they are Two independent object

    String s1 = "Java"; // String Pool/ immutable we cannot modify
     s1 = "JavaScript"; // new object will be created in memory
        System.out.println(s1);

        String s2 = "Java"; // no new object will be created in the memory. because already exist (s1).

        System.out.println(s1 == s2); // false
        //        "JavaScript" == "Java"



    }
}

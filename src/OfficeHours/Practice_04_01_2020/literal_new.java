package OfficeHours.Practice_04_01_2020;

public class literal_new {
    public static void main(String[] args) {

        String s1 = "Java"; // String literal
        String s2 = "Java"; // String literal
        // s1 and s2 are same object => Java created 1 object in
        // same memory location, which means in the String pool.

        String s3 = new String("Java"); // different object than s4
        String s4 = new String("Java"); // different object than s3

        System.out.println(s1 == s2); // true, same objects

        System.out.println(s1 == s3); // false, different objects at different memory

        System.out.println(s3 == s4); // false, different objects



    }
}

package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "Cybertek School"; // One objcet("Cybertek") in String Pool
        //            01234567 (index number)

 // 1. charAt(indexNumber): it returns the char at the given index
        char ch1 = str.charAt(5); // 't'
        System.out.println(ch1 == 'A');
        //                  't' == 'A' ==> false
        System.out.println(ch1 == 'T');
        //                  't' == 'T' ==> false
        System.out.println("=========================");
        System.out.println(ch1 == 't'); // 't'(ch1) == 't' ==> true

// 2. length(): returns the total number of the characters as int
        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength > 100); // false


        String str2 = "Today is great day, Java is Fun";
        //             012345....                 ...31
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum); // 30 ==> Index Number = Length - 1
                   // length is ALWAYS one unit above the maximum index number

// 3. concat(Value): Concatenation, concats the given value
// to the String and returns a new value
        String s1 = "Cybertek";
        s1 = s1.concat("School"); // "Cybertek School"
        System.out.println(s1); // "Cybertek School"

        String s2 = "Java";
        s2 = s2.concat(" is a programming language");
        System.out.println(s2); // Java is a programming language

        String s3 = "My name is";
        s3 = s3.concat(" Alfonso Santorin II");
        System.out.println(s3); // My name is Alfonso Santorin II

        String r1 = "Java is fun";
        r1 = r1.concat(", and it's easy");
        System.out.println(r1); // Java is fun, and it's easy

// 4. toLowerCase() : converts to lowercase and returns a new String
        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1); // cybertek

// 5. toUpperCase(): converts to uppercase and returns a new String
        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2); // CYBERTEK SCHOOL

// 6. trim(): remove the unused(not between words) spaces, and returns new String
        String A1 = "       Today is a great day        maybe";
        A1 = A1.trim(); // ONLY IF there is any space that's not
                        //  seperating the words, will be removed
        System.out.println(A1);

        System.out.println("=================================");








    }
}

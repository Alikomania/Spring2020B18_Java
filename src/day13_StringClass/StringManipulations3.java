package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        String str = "I like Java programming John";

// 10. indexOf(Value): returns the index number
// of the first occured character as an int
     int num1 = str.indexOf("J"); // very FIRST occured character
    // int num1 = str.indexOf("John"); // 24 (first character of John's index number ==> "J"
        System.out.println(num1); // 7 (First "J")

        String str2 = "Cybertek school is awesome";

        int firstS = str2.indexOf("s"); // 9
        int secondS = str2.indexOf("is") + 1; // 17

        System.out.println(firstS); // 9
        System.out.println(secondS); // 17

        System.out.println("=======================");

        int maxIndexnumber = "Cybertek".length() - 1; // 8 - 1
        System.out.println(maxIndexnumber); // 7

        String names = "Muhtar";
            int a1 = names.indexOf("Good Guy");
        System.out.println(a1); // -1 ==> if it gives Negative number its mean new value does not exist in the String

        String fullname = "Rahman Abdalla";
        String firstName = fullname.substring(0, fullname.indexOf(" ") );
        String lastName = fullname.substring( fullname.indexOf(" ") +1 );

        System.out.println(firstName); // Rahman
        System.out.println(lastName); // Abdalla

        String full2 = "Alfonso Santorin";
        String first = full2.substring(0, full2.indexOf(" ") );
        String last = full2.substring( full2.indexOf(" ")+1 );
        System.out.println(first); // Alfonso
        System.out.println(last); // Santorin




    }
}

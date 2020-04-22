package OfficeHours.Practice_04_01_2020;

public class StrgingMethods {
    public static void main(String[] args) {

// 1. charAt(indexNumber): returns char at then given index, char primitive

        String str1 = "Java";
        //             0123
        char ch1 = str1.charAt(3);
        System.out.println(ch1); // a

    //    char ch2 = str1.charAt(4);
    //    System.out.println(ch2); // String index out of range: 4

        System.out.println("=======================");
// 2. length(): returns the total number of chars, as an int

        String str2 = "Cybertek SchooL";
                //     0123456789... 14
        int total = str2.length();
        System.out.println(total); // length => 15; indexNumber => 14

        int maxIndex = str2.length()-1;

        char ch3 = str2.charAt(maxIndex);
        System.out.println(ch3); // L
        System.out.println("===========================");

// 3. concat(str): concatenation, returns new String, + also does concatenation

    String str3 = "Cybertek";
    str3 = str3.concat(" School");
        System.out.println(str3); // Cybertek School

        String str4 = "Java";
        str4 = str4.concat(" is fun");
        System.out.println(str4);
        System.out.println("========================");

// 4. & 5. toLowerCase() & toUpperCase():

        String str5 = "CYBERTEK SCHOOL";
        str5 =    str5.toLowerCase(); // "cybertek school"

        System.out.println(str5);

        String str6 = "muhtar";
        str6 =  str6.toUpperCase();//  "MUHTAR";

        System.out.println(str6);

        System.out.println("=============================================");

        // trim(): removes unused(white) spaces from the string, returns new String
        String str7 = "        Cybertek          ";
        str7  =    str7.trim();// "Cybertek";

        System.out.println(str7);
        System.out.println(str7.length());

        String str8 = "       ";
        str8 = str8.trim(); // ""

        System.out.println( str8.length() ); //0

        System.out.println("=============================================");

        //substring(beginningindex, ending index):  creates substring strating from beginning index till ending index (ending index is excluded)
        String sentence1 = "I like Java";
        //          012345678910
        //last index number = length-1

        String word1 =  sentence1.substring(7, sentence1.length() ); // "Java"
        String word2 = sentence1.substring(2, 6);

        // "likeJava"
        String word3 = sentence1.substring(2, 6)+ sentence1.substring(7, sentence1.length() );

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        //substring(begiining index): creates the sub string from beginning index till the end of the string. returns new string
        String sentence2 = "I like to learn Java";
        //                  0123456789

        String r1 =  sentence2.substring(10);  // "learn Java";
        System.out.println(r1);

        String r2 = "Java"; //JaVa;
        //       0123
        String r3 = r2.substring(0, 2);   //Ja

        String r4 = r2.substring(2,3) ;  // v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa

        System.out.println(result);


        System.out.println("=============================================");

        //replace(old str, new str): replaces all the matching ones, returns new string
        String str = "I like C#, C# is cool";
        str =   str.replace("C#" , "Java" ); // "I like Java, Java is cool"

        System.out.println(str);

        //replaceFirst(old str, new str): replace the firast matching one, returns new string
        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java", ", C#");
        System.out.println(t1);

        System.out.println("=============================================");
        // indexOf(str): returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
        int a1 =  y1.indexOf("W");  // first W' index num
        int a2 = y1.indexOf("Wednesday");  // second W' index num
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str): returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
        System.out.println(a3);











    }
}

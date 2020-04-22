package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            01234567

// 7. A - substring(beginning index, ending index) [TWO PARAMETER]:
// createst substring of the string value from the beginning index
// till the ending index (ending index is EXCLUDED)
        String schoolName = str.substring(0, 8); // (ending index is EXCLUDED)
        System.out.println(schoolName); // Cybertek

        String fullName = "Kuzzat Altay";
        //                 0123456789..
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7, 11+1);
        System.out.println(firstName); // Kuzzat
        System.out.println(lastName); // Altay

        // Task: full name = firstname + lastname
        // gmail: lastName_firstName@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        String firstname = Murtaza.substring(0, 6+1);
        String lastname = Murtaza.substring(8, 14+1);
        firstname = firstname.toLowerCase(); // murtaza
        lastname = lastname.toLowerCase(); // nazeeri

        //  String gmail = lastname+"_"+firstname+"gmail.com";
         String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
      //   String gmail = Murtaza.substring(8, 14+1)+"_"+Murtaza.substring(0,6+1)+"@gmail.com"; ==> (Alternate, but not advice)
        System.out.println(gmail); // nazeeri_murtaza@gmail.com

        System.out.println("========================================");

        String s1 = "I love Java Programming Language";
        //           01234567

// 7. B - substring(beginning index) [ONE PARAMETER]:
// createst substring of the string value from the
//	beginning index till the end of the string
    String className = s1.substring(7);
    System.out.println(className); // Java Programming Language

// 8. replace(old Value, new Value):
// new value will be replaced with
// ALL the given old value, and returns new string
        String s2 = "I like C# Programming C# C#";
              s2 =  s2.replace("C#", "Java"); // ALL C# to replaced Java
        System.out.println(s2); // I like Java Programming Java Java

        String s3 = "My name name is is Al Al Al Santorin";
        s3 = s3.replace("Al", "Alfonso");
        System.out.println(s3);

        String name = "COVID 18";
        name = name.replace("8", "9");
        System.out.println(name); // COVID 19

// 9. replaceFirst(old Value, new Value):
// new value will be replaced with the
// VERY FIRST the given old value, and returns new string
        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");
        System.out.println(r1); // I like Java, C# is fun, C# is cool

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replace("Tomorrow", "Today"); // Today is Monday, Today is Tuesday
        r2 = r2.replaceFirst("Tomorrow", "Today"); // Today is Monday, Tomorrow is Tuesday
        System.out.println(r2); // Today is Monday, Today is Tuesday






    }
}

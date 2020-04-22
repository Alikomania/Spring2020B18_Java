package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail); // true
        if(result){
            System.out.println("Logged in");
        }

        System.out.println("=============================");

 /*
 valid password MUST contain a special
 characters such as(!, _, $)
 valid password should not contain spaces
  */

    String passWord = "mmasd1235";

    if(passWord.contains(" ")){
        System.out.println("Password cannot have space in it");
    } else {
        System.out.println("valid password");
    }

        System.out.println("==========================");

    /*
    every website has "www" at the beginning
    of web address
     */

    String webAddress = "www.amazon.com";
    webAddress = webAddress.toLowerCase();

    if(webAddress.startsWith("www.") ){
            System.out.println("valid");
        }
        System.out.println("==============================");

    /*
    every single gmail address ends with
    @gmail.com
     */

    String email = "CybertekSchool@Yahoo.com";

    if(email.endsWith("@gmail.com")){
        System.out.println("valid gmail address");
    } else {
        System.out.println("Invalid gmail address");
    }
        System.out.println("=============================");



    }
}
